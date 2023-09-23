package com.example.project02.service;

import com.example.project02.DTO.BoxDTO;
import com.example.project02.entity.Box;
import com.example.project02.repository.BoxRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class BoxServiceImplTest {

    @Mock
    private BoxRepository boxRepository;

    @InjectMocks
    private BoxServiceImpl boxService;

    @BeforeEach
    public void setUp() {
        // Mockito 초기화
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetAllBoxes() {
        // 리포지토리 동작을 가상으로 설정
        List<Box> mockBoxList = new ArrayList<>();
        mockBoxList.add(new Box());
        mockBoxList.add(new Box());

        when(boxRepository.findAll()).thenReturn(mockBoxList);

        // 서비스 메서드 호출
        List<BoxDTO> boxDTOList = boxService.getAllBoxes();

        // 단언문
        assertEquals(2, boxDTOList.size());

        // 리포지토리 메서드가 호출되었는지 확인
        verify(boxRepository, times(1)).findAll();
    }

    @Test
    public void testGetBoxById() {
        // Mocking the behavior of the repository
        Box mockBox = new Box();
        mockBox.setName("상자이름"); // 예상 결과 설정
        when(boxRepository.findById(1L)).thenReturn(Optional.of(mockBox));

        // Calling the service method
        BoxDTO boxDTO = boxService.getBoxById(1L);

        // Assertions
        assertEquals("상자이름", boxDTO.getName()); // 예상 결과와 일치하는지 확인

        // Verifying that the repository method was called
        verify(boxRepository, times(1)).findById(1L);
    }

    // 비슷한 방식으로 createBox, updateBox, deleteBox 등 다른 메서드에 대한 테스트를 작성할 수 있습니다.
}

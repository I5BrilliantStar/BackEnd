<h1 align="center">스마트 물류 자동화 시스템 프로젝트 백엔드 💻 </h1>

## 🛠️ 기술 스택

<img src="https://img.shields.io/badge/SpringBoot-6DB33F?style=round&logo=Spring&logoColor=white" /> <img src="https://img.shields.io/badge/MySQL-4479a1?style=round&logo=mysql&logoColor=white" /> <img src="https://img.shields.io/badge/Apache Kafka-231F20?style=round&logo=apache kafka&logoColor=white" />

## 🤹🏻 기술 스택 선정 이유

- SpringBoot : Spring Boot는 Java 기반의 웹 응용 프로그램을 빠르게 구축하고 배포하기 위한 프레임워크로, 개발 생산성을 향상시키며 많은 개발자 커뮤니티와 지원을 갖추고 있습니다. 또한 Spring Boot는 강력한 기능과 모듈을 제공하여 웹 애플리케이션을 안정적으로 운영할 수 있게 해줍니다.

- MySQL : MySQL은 신뢰성 있는 오픈 소스 데이터베이스 관리 시스템으로, 데이터의 안정성과 일관성을 보장하며 빠른 데이터 액세스와 쿼리 처리를 제공합니다. MySQL은 많은 애플리케이션에서 사용되는 데이터베이스로, 대부분의 개발자와 운영팀이 익숙한 기술입니다.

- Apache Kafka : Apache Kafka는 대규모 데이터 스트리밍 및 이벤트 처리를 위한 분산 스트리밍 플랫폼으로, 대량의 데이터를 안정적으로 전송, 저장 및 처리할 수 있습니다. 이는 데이터 흐름 처리 및 이벤트 기반 애플리케이션을 구축하는 데 매우 중요한 역할을 합니다.

## 📌 프로젝트 목표

```sh
스프링 부트를 활용하여 데이터베이스 테이블을 CRUD할 수 있는 Restful API를 개발했습니다.

JPA를 사용하여 데이터베이스와 상호 작용을 단순화하고 객체 지향 설계를 채택했습니다.

IoT 장비의 상태 메시지와 장비 제어 명령 메시지를 전송하기 위해 카프카와 웹소켓을 활용합니다.

백엔드 및 IoT 장비에서 카프카 Producer 및 Consumer를 사용하여 메시지를 교환합니다.

백엔드 및 프론트엔드 간에 웹소켓을 활용하여 메시지를 실시간으로 전송 및 수신합니다.
```

## 📄 API 명세서

[[설계도 확인할 수 있는 링크 또는 그림]](www.naver.com)

## 🔍 Overview

### 📸1. 실시간 AI 카메라 모니터링 및 제어

<center>
    <img src="./img/pic2.png" />
</center>

```sh
카메라 모니터링 시 물류 QR코드를 실시간으로 인식하고, 해당 물류 정보를 데이터베이스에 저장합니다.

이를 통해 물류 정보를 관리하고 추적하며, 물류 작업에 대한 실시간 모니터링 및 제어가 가능합니다.
```

<br>

### 💻2. 장비 상태 모니터링

<center>
    <img src="./img/pic1.png" />
</center>

```sh
카프카와 웹소켓을 사용하여 IoT 장비의 상태를 모니터링하고 제어합니다.

이를 통해 IoT 장비에 명령을 보내고 상태를 확인하여 실시간으로 장비를 모니터링하고 제어할 수 있습니다.
```

<br>

### 🔎3. ERD

<center>
    <img src="./img/erd.png" />
</center>

```sh
데이터베이스의 ERD입니다.
```

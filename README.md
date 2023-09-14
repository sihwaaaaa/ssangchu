# 🌿 상추마켓 - 상상하던 당신의 물품을 추천합니다!

![logo](https://sihwaaaaa.github.io/img/ssangchu-img/main_image2.png)

### ✔️Language

  <img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white">
  <img src="https://img.shields.io/badge/javascript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black">
  <img src="https://img.shields.io/badge/html5-E34F26?style=for-the-badge&logo=html5&logoColor=white">
  <img src="https://img.shields.io/badge/css-1572B6?style=for-the-badge&logo=css3&logoColor=white">

### ✔️Framework & Library

   <img src="https://img.shields.io/badge/Spring MVC-6DB33F?style=for-the-badge&logo=spring&logoColor=white">   
    <img src="https://img.shields.io/badge/Bootstrap-563D7C?style=for-the-badge&logo=bootstrap&logoColor=white">
    <img src="https://img.shields.io/badge/jquery-1572B6?style=for-the-badge&logo=jquery&logoColor=white"> 
    <img src="https://img.shields.io/badge/mybatis-1A285F?style=for-the-badge&logoColor=white">

### ✔️DataBase

   <img src="https://img.shields.io/badge/mariaDB-003545?style=for-the-badge&logo=mariaDB&logoColor=white">

### ✔️Infrastructure

   <img src="https://img.shields.io/badge/Amazon EC2-FF9900?style=for-the-badge&logo=Amazon EC2&logoColor=white">
    <img src="https://img.shields.io/badge/Nginx-009639?style=for-the-badge&logo=Nginx&logoColor=white">
    <img src="https://img.shields.io/badge/apache tomcat-F8DC75?style=for-the-badge&logo=apachetomcat&logoColor=white">

---

### [▶️Github](https://github.com/sihwaaaaa/ssangchu)

### [▶️View Demo](https://ssangchu.poetrypainting.co.kr/)

- 데모체험을 위한 로그인 정보
- ID:javaman
- PW:1234

### [▶️Other Projects (Portfolio) ](https://sihwaaaaa.github.io/)

<br>

## ✔️ 목차

1. [ 상추마켓 ❓](#❓-상추마켓)
   - [프로젝트 개요](#프로젝트-개요)
   - [상추마켓이 뭔가요?](#상추마켓이-뭔가요)
2. [설계 🛠](#🛠-설계)
   - [요구사항 정의서](#요구사항-정의서)
   - [프로토 타이핑](#프로토-타이핑)
   - [데이터 베이스 구조](#데이터-베이스-구조)
   - [프로젝트 관련 서류](#프로젝트-관련-서류)
3. [ 상추마켓 주요 기능 ⭐️](#⭐️상추마켓-주요-기능)
4. [이슈사항 및 리뷰](#❗️-이슈사항-및-리뷰)
5. [팀 소개 👬](#👬-팀-소개)
6. [활용 API](#활용-api)

<br>

## ❓ 상추마켓

### 프로젝트 개요

- 개발기간 : 2023.03.30 ~ 2023.04.25
- 버전 정보 :
  - Java-1.8v
  - Spring-5.0.7.RELEASE
- 프로젝트 선정 배경
  - 위치기반 : 유저가 설정한 주소를 바탕으로 API를 활용하여 원하는 위치 범위 내 상품 조회
  - 실시간 채팅 : 웹소켓을 사용해 사용자간 실시간 채팅 구현
  - 첨부파일 : 이미지 위주의 웹페이지로 첨부파일 컨트롤
  - 다양한 외부 API와 Library 활용

### 상추마켓이 뭔가요?

- 사용자가 설정한 주소를 바탕으로 지역내의 다른 유저와 실시간 채팅을 통해 거래를 진행하는 위치기반 중고거래 플랫폼
- 중고나라, 번개장터, 당근마켓 등 현존하는 중고거래 플랫폼을 모티브로 제작

<br>

## 🛠 설계

### 요구사항 정의서

[요구사항 정의서 문서 엑셀 파일](https://docs.google.com/spreadsheets/d/1YxHaZO9AvSjO8rJ58U5hy0EonsgR0sDu/edit?usp=sharing&ouid=103129887732611832496&rtpof=true&sd=true)

주요 구현 사항

- 회원
  - 회원가입
  - 로그인
  - 로그아웃
  - 회원정보 수정
  - 회원탈퇴
  - 회원등급
  - 마이페이지
  - 상점페이지
- 게시판
  - CRUD 기능
  - 페이징
  - 카테고리
  - 검색
  - 첨부파일(이미지)
  - 글 신고 기능
- 주소
  - CRUD 기능
  - 다른 사용자와의 거리 측정
- 채팅
  - 실시간 채팅
  - 채팅 수신 여부 확인
- 후기
  - 후기 작성 및 수정
- 거래
  - 거래 신청
  - 거래 취소
  - 거래 완료
- 관리자
  - 글 비공개
  - 사용자 경고
  - 계정 탈퇴처리

---

### 프로토 타이핑

[디지털 프로토 타이핑 - 오븐페이지](https://ovenapp.io/project/uzP0FsOGlJcAkMrYQmxIQDuodaBQ0kqX#uizuV)

- 디지털 프로토 타이핑 형식으로 진행
- 카카오 오븐을 활용해 UI/UX 디자인 및 페이지 구현시 가이드라인 제시

---

### 데이터 베이스 구조

![ERD](https://sihwaaaaa.github.io/img/ssangchu-img/erd.png)

---

### 프로젝트 관련 서류

[업무분장표](https://docs.google.com/spreadsheets/d/1FeiJ1zbTnU5uGgi010z7RDCUUkyGwgBd/edit?usp=sharing&ouid=103129887732611832496&rtpof=true&sd=true)

[API정의서](https://docs.google.com/spreadsheets/d/1HJ59gwK1n6ZkDTn3ZCK8kZlTPO3BTIZU/edit?usp=sharing&ouid=103129887732611832496&rtpof=true&sd=true)

[테스트케이스](https://docs.google.com/spreadsheets/d/1FgZMQdzKedFm_bD7jIp8kErY4jmTeIF_/edit?usp=sharing&ouid=103129887732611832496&rtpof=true&sd=true)

[테이블정의서](https://docs.google.com/spreadsheets/d/1ffgNuKJAbdarZkQN-2t_blE-zp7f-d6u/edit?usp=sharing&ouid=103129887732611832496&rtpof=true&sd=true)

<br>

## ⭐️상추마켓 주요 기능

### 회원

![slide15](https://sihwaaaaa.github.io/img/ssangchu/슬라이드15.JPG)
![slide16](https://sihwaaaaa.github.io/img/ssangchu/슬라이드16.JPG)

### 마이페이지

![slide17](https://sihwaaaaa.github.io/img/ssangchu/슬라이드17.JPG)

### 상점페이지

![slide18](https://sihwaaaaa.github.io/img/ssangchu/슬라이드18.JPG)

### 주소

![slide19](https://sihwaaaaa.github.io/img/ssangchu/슬라이드19.JPG)

### 게시판

![slide20](https://sihwaaaaa.github.io/img/ssangchu/슬라이드20.JPG)
![slide21](https://sihwaaaaa.github.io/img/ssangchu/슬라이드21.JPG)
![slide22](https://sihwaaaaa.github.io/img/ssangchu/슬라이드22.JPG)

### 거래

![slide23](https://sihwaaaaa.github.io/img/ssangchu/슬라이드23.JPG)

### 채팅

![slide24](https://sihwaaaaa.github.io/img/ssangchu/슬라이드24.JPG)

### 후기

![slide25](https://sihwaaaaa.github.io/img/ssangchu/슬라이드25.JPG)

### 관리자

![slide26](https://sihwaaaaa.github.io/img/ssangchu/슬라이드26.JPG)

<br>

## ❗️ 이슈사항 및 리뷰

> 현재 메일건 api 무료기한 만료로 메일인증이 불가하며 없어도 회원가입은 가능합니다. 또한 프로젝트 용량이 커서 AWS 프리티어에서는 서버과부화가 걸립니다. 페이지 로딩시 체감될 정도로 느립니다. 회원 및 후기 부분의 오류가 있으며 전체적으로 사용자 UI/UX 부분이 부족합니다. 건강상의 이유로 중도하차한 팀원의 기능을 제가 맡게 되어 본인의 담당기능을 구현하기도 바빠 팀원들의 어려움을 많이 도와주지 못해 팀장으로서 많이 아쉬움이 남습니다.

> 찜(좋아요),구독 및 반응형웹 등 요구사항으로 있었던 후순위 기능들을 시간에 쫓겨 구현하지 못했습니다. 세미 프로젝트였음에도 데이터베이스 테이블 16개정도의 다소 큰 볼륨과 미숙했던 spring 프레임워크 사용으로 자잘한 오류와 함께 완성도가 조금 떨어집니다.

> 프로젝트 버전관리 툴로 SVN을 사용했습니다. 팀장으로서 SVN서버를 직접 구축했으며, 요구사항 정의서, 테이블명세서, API정의서 등 프로젝트 관련 서류를 책임지고 작업했습니다. PPT제작 & 발표 & 시연 또한 직접 작업했습니다.

> 팀장을 맡아 부담감도 크고 그만큼 역량이 부족한 것 같아 처음엔 자신감이 없었지만 팀원들이 같이 으쌰으샤 해주고 많이 도와줘서 무사히 끝낼 수 있었던 것 같습니다. 팀워크와 소통의 중요성을 깨달을 수 있었습니다. 또한 프로그래밍을 접한지 3개월정도의 지식과 경험에 비해 좋은 결과물을 냈다고 생각하며 그만큼 많은 시간 몰두했고 프로그래밍의 매력을 알게되었습니다.

<br>

## 👬 팀 소개

![role](https://sihwaaaaa.github.io/img/ssangchu-img/role.png)
<br>

## 활용 API

![API](https://sihwaaaaa.github.io/img/ssangchu-img/api.jpg)

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

### [▶️Other Projects (Portfolio) ](https://sihwaaaaa.github.io/)

<br>

## ✔️ 목차

1. [ 상추마켓 ❓](#-줍깅-프로젝트)
   - [프로젝트 개요](#프로젝트-개요)
   - [상추마켓?](#상추마켓)
2. [설계 🛠](#-설계)
   - [요구사항 정의서](#요구사항-정의서)
   - [프로토 타이핑](#프로토-타이핑)
   - [데이터 베이스 구조](#데이터-베이스-구조)
   - [프로젝트 관련 서류](#프로젝트-관련-서류)
3. [ 상추마켓 주요 기능 ⭐️](#-상추마켓-주요-기능)
4. [이슈사항 및 리뷰](#이슈사항-및-리뷰)
   - [발생 이슈](#발생-이슈)
   - [리뷰](#리뷰)
5. [팀 소개 👬](#-팀-소개)
6. [활용 API](#활용-API)

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

### 상추마켓 ?

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

## 이슈사항 및 리뷰

### 발생 이슈

❗️ **공공데이터와 TMAP API 사용 좌표 사용 괴리**

- 공공데이터의 좌표가 API에서 요청하는 위경도 값이 아닌 gs80tm 좌표 사용 -> 좌표마다 일일이 API에 변환 요청을 할 경우 과다한 호출 우려

✔️ **TMAP API의 좌표변환 기능을 사용하여 위경도 좌표로 변환된 값을 DB에 저장**

```
// 이 코드에서는 전에 db에 저장한 데이터를 불러와서 tmapAPI에 좌표변환을 요청합니다
// (GRS80TM(기존 좌표계 - Transverse_Mercator 투영법과 GRS_1980 타원체를 사용) => WGS84GEO(변환될 좌표계- 경위도))
// 응답 값들을 기존 디비 값에 업데이트 시킵니다

  const location = useLocation();
  const route = location.state;
  const [result, setResult] = useState({ lon: null, lat: null });
  const [startX, setStartX] = useState(route.startX);
  const [startY, setStartY] = useState(route.startY);
  function coordConvert(lat, lon) {
    axios
      .get(
        `https://apis.openapi.sk.com/tmap/geo/coordconvert?version=1&format=json&callback=result&fromCoord=GRS80TM&lon=${lon}&lat=${lat}&appKey=앱키`,
      )
      .then(function (response) {
        const resultCoordinate = response.data.coordinate;
        const lon2 = resultCoordinate.lon;
        const lat2 = resultCoordinate.lat;
        const result = { lon: lon2, lat: lat2 };
        setResult(result);
        console.log(result);
      })
      .catch(function (error) {
        console.error('code:', error.response.status);
        console.error('message:', error.response.data);
        console.error('error:', error.message);
      });
  }

  useEffect(() => {
    axios
      .get(
        `https://apis.openapi.sk.com/tmap/geo/coordconvert?version=1&format=json&callback=result&fromCoord=GRS80TM&lon=${startY}&lat=${startY}&appKey=앱키`,
      )
      .then(function (response) {
        const resultCoordinate = response.data.coordinate;
        const lon2 = resultCoordinate.lon;
        const lat2 = resultCoordinate.lat;
        const result = { lon: lon2, lat: lat2 };
        console.log(result);
      })
      .catch(function (error) {
        console.error('code:', error.response.status);
        console.error('message:', error.response.data);
        console.error('error:', error.message);
      });
    console.log(result.lon);
    setStartX(result.lon);
    setStartY(result.lat);
    const map = new Tmapv2.Map('map_div', {
      center: new Tmapv2.LatLng(startX, startY),
      width: '100%',
      height: '700px',
      zoom: 15,
    });
    const marker = new Tmapv2.Marker({
      position: new Tmapv2.LatLng(startX, startY),
      icon: 'http://tmapapi.sktelecom.com/resources/images/common/pin_car.png',
      map,
    });
    // const content = '<div>' + '    <button>' + '        시작하기';
    // '    </button>' + '</div>';
    // const infoWindow = new Tmapv2.InfoWindow({
    //   position: new Tmapv2.LatLng(latitude, longitude), //Popup 이 표출될 맵 좌표
    //   content: content, //Popup 표시될 text
    //   type: 2, //Popup의 type 설정.
    //   map: map, //Popup이 표시될 맵 객체
    //   align: Tmapv2.InfoWindowOptions.ALIGN_LEFTBOTTOM,
    // });
  }, [route]);

```

---

❗️ **TMAP API 보행자 경로 경유지 수 제한**

- 사용하고 있는 데이터의 경유지는 평균 10개이상이지만 TMPA API에서 지원하는 보행자 경로는 5개까지만 경유지 설정 가능

✔️ **API를 다수 호출하여 지도에 한번에 표시**

- 출발지 ~ 6번째 경유지로 API호출 이어서 6번째 경유지 ~ n번째 경유지 호출 ~ 도착지 경유지까지 반복

```
 // 경유지 개수별 나누기
    const passResult = [];
    const numStops = stopovers.length;

    for (let i = 0; i < numStops; i += 5) {
      const passListSlice = passList.slice(i, i + 5);
      const passResultSlice = parsePassList(passListSlice);

      if (i + 5 < numStops) {
        const nextStop = stopovers[i + 5];
        const nextX = nextStop.viaX;
        const nextY = nextStop.viaY;
        tmapApi(passResultSlice, startX, startY, nextX, nextY);
      } else {
        tmapApi(passResultSlice, startX, startY, endX, endY);
      }
    }

    if (numStops > 5) {
      const lastStopIndex = Math.min(numStops, 5);
      const lastPassList = passList.slice(lastStopIndex);
      const lastPassResult = parsePassList(lastPassList);
      const lastStop = stopovers[lastStopIndex - 1];
      const lastX = lastStop.viaX;
      const lastY = lastStop.viaY;
      tmapApiNotPass(lastX, lastY, endX, endY);
    }

```

---

❗️ **Geolocation API의 HTTP 프로토콜 비호환**

- localhost를 제외한 http 프로토콜에서는 geolocation 이용불가

✔️ **무료인증서 certbot를 이용해 HTTPS로 변환**

---

### 리뷰

> TMAP API의 사용가이드는 js 베이스였기 때문에 리액트에 대한 개념과 경험이 많이 부족한 상태에서 어려움이 있었지만 어이없는 경우의 많은 삽질 끝에 많이 배울 수 있었습니다. 😂

> 플로깅 시작시 시간카운팅에 대한 오류와 useEffect 제어가 미숙해 새로고침을 안하면 지도가 로딩되지 않는 경우의 오류가 있습니다. 이러한 오류들과 직선거리로만 이동거리를 계산한다는 점이 큰 아쉬움으로 남습니다.

> 모바일 앱 환경이 아닌 웹기반으로 제작되었기 때문에 설계시 이게 가능할까 어떻게 구현해야할까 많은 고민이 있었습니다. 또한 제한된 환경에서 테스팅조차 어려움이 있었기에 걱정이 많았지만 실제로 모바일 웹에서 작동하는 걸 보며 굉장히 뿌듯함을 느꼈습니다.

> 프로젝트에서 어렵고 중요한 핵심 기능을 맡았고 api를 적극활용해야 했기에 어려움이 많았지만 오히려 그만큼 성장할 수 있는 시간이었습니다. 또한 난이도가 높았던 만큼 재미도 있었기에 후순위였던 기능들도 꼭 나중에 구현해보고 싶습니다.

<br>

## 👬 팀 소개

<div align="center">

|                                                            천은경(팀장)                                                            |                                      김민수                                       |                                      박연재                                       |
| :--------------------------------------------------------------------------------------------------------------------------------: | :-------------------------------------------------------------------------------: | :-------------------------------------------------------------------------------: |
| <img height="160px" src="https://user-images.githubusercontent.com/121186383/242636171-4e873ee3-bb3e-4961-806a-2f960c7210d1.jpg"/> | <img width="160px" src="https://avatars.githubusercontent.com/u/113892151?v=4" /> | <img width="160px" src="https://avatars.githubusercontent.com/u/132035172?v=4" /> |
|                                                 [@olo02](https://github.com/olo02)                                                 |              [@KimMinSoocoding](https://github.com/KimMinSoocoding)               |                    [@yeonjae97](https://github.com/yeonjae97)                     |
|                               - SNS 및 플친 기능 <br> - 커뮤니티/첨부파일 <br> - 회원 기능 : 관리자                                |         - 챌린지 기능 <br> - 챌린지원 및 일정 <br> - 로고 및 뱃지 디자인          |                     - 회원 기능 <br> - Security <br> - Oauth                      |

|                                   ⭐️이시화⭐️                                    |                                      이재원                                       |     |
| :-------------------------------------------------------------------------------: | :-------------------------------------------------------------------------------: | :-: |
| <img height="160px" src="https://avatars.githubusercontent.com/u/132035158?v=4"/> | <img height="160px" src="https://avatars.githubusercontent.com/u/132035168?v=4"/> |     |
|                    [@sihwaaaaa](https://github.com/sihwaaaaa)                     |               [@flatspringjava](https://github.com/flatspringjava)                |     |
|                - 플로깅 기능 <br> - 데이터 마이닝 <br> - 추천경로                 |                        - 리워드 기능 <br> - 포인트 및 뱃지                        |     |

</div>

## 활용 API

![API](https://sihwaaaaa.github.io/img/api.png)

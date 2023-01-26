# Project
2022년 프로젝트 "인공지능을 활용한 대화형 해상물류 통합민원 서비스 개발"에 대해 정리한 문서입니다.

## 프로젝트 설명 
Port-Mis를 모바일로 사용할 순 있지만, 관련된 어플리케이션은 존재하지 않습니다.
그래서 Port-Mis의 기능과 해양수산부에서 개발한 GICOMS 해양안전종합정보시스템을 참고하여 
데이터를 사용자에게 보여주는 어플리케이션을 개발하기로 하였습니다.


###    역할분담 
| 팀원목록 | 담당파트 | 
| ------ | ------ |
| 태훈 | 챗봇 메인 개발, 프론트엔드 메인 개발(안드로이드 스튜디오), UI디자인 |
| 정민 | 서버 서브 개발, DB 서브 개발, UI디자인 | 
| 주영 | 챗봇 서브 개발, UI디자인 | 
| 혜린 | 서버 메인 개발, DB 메인 개발, UI디자인 | 

## 주요 기능
- **챗봇**  
    앱의 핵심 기능입니다. 사용자가 입력한 단어, 문장을 분석해 해당되는 데이터를 전달합니다.  

- **선박 입출항 조회**   
    선박의 입출항 데이터를 조회합니다. 사용자가 알고싶은 선박의 청코드, 입출항기간, 호출부호를 입력하여 관련된 데이터를 조회할 수 있습니다.  

- **선별 관제 현황**  
    선박의 관제 현황 데이터를 조회합니다. 사용자가 알고싶은 선박의 청코드, 입출항기간, 호출부호를 입력하여 관련된 데이터를 조회할 수 있습니다.  

- **날씨 정보**  
    기상청, 공공데이터 포털에서 날씨 정보를 가져와 온도, 습도, 미세먼지, 풍향 등의 정보를 제공합니다. 

- **게시판**   
    APP사용자들간의 소통 창구입니다. 항만 관련 게시글을 올릴 수 있습니다.


## 개발 환경

- 백엔드 : Node.js, PHP
- 프론트엔드 : ui디자인 -figma / 화면 구현 및 기능 구현 - 안드로이드 스튜디오
- DB : MYSQL
- 챗봇 : MicrosoftBotFrameWork
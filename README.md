# UsWayTrip🌍

**1. 프로젝트 목표 및 요구사항** 

   ‘마이리얼트립’을 벤치마킹하여 설계된 여행사 관련 홈페이지
  
**2. 진행 기간** 

  2022.11.15 ~ 2022.12.09
  
**3. 주요 개발자원 (S/W)**
<table border="1">
		<tr>
			<th>구 분</th>
			<th>용 도</th>
			<th>명칭 및 버전</th>
		</tr>
		<tr align="center">
			<td>OS</td>
			<td>개발 PC</td>
			<td>Windows 10</td>
		</tr>
		<tr align="center">
			<td>WAS</td>
			<td>WEB/WAS</td>
			<td>Apach Tomcat 9</td>
		</tr>
		<tr align="center">
			<td>미들웨어</td>
			<td>DB</td>
			<td>OracleXE</td>
		</tr>
		<tr align="center">
			<td rowspan="3">사용 언어</td>
			<td>백 앤드</td>
			<td>java jdk 1.8 , jsp/servlet 3.1</td>
		</tr>
		<tr align="center">
			<td>개발 프레임 워크</td>
			<td>spring framework 5.0.2 , Spring Boot 2.7.7</td>
		</tr>
		<tr align="center">
			<td>프론트 앤드</td>
			<td>HTML5 , CSS3 , JAVASCRIPT, JAVA</td>
		</tr>
		<tr align="center">
			<td rowspan="2">소프트웨어 개발도구</td>
			<td>개발도구</td>
			<td>STS</td>
		</tr>
		<tr align="center">
			<td>DB</td>
			<td>SQLD</td>
		</tr>
		<tr align="center">
			<td>형상 관리및 협업</td>
			<td>소스 관리 및 버전관리</td>
			<td>Git hub , Git</td>
		</tr>
		<tr align="center">
			<td rowspan="13">사용 라이브러리 및 API</td>
			<td>관리</td>
			<td>Maven</td>
		</tr>
		<tr align="center">
			<td>db</td>
			<td>Mybatis-3.5.3</td>
		</tr>
		<tr align="center">
			<td>로그</td>
			<td>Spring AOP , Log4j</td>
		</tr>
		<tr align="center">
			<td>디자인</td>
			<td>Bootstrap , JQuery UI</td>
		</tr>
		<tr align="center">
			<td>보안</td>
			<td>Spring Security-5.0.8</td>
		</tr>
		<tr align="center">
			<td>데이터 전송</td>
			<td>Ajax</td>
		</tr>
		<tr align="center">
			<td>화면 UI</td>
			<td>JQuery-3.5.2</td>
		</tr>
	</table>
  
**4. 담당 기능**
  * Earth Way Trip DB 명세서 관련 참고 자료 작성 
  * 국내 숙소 관리 기능 구현
    * 숙소 CRUD
    * 숙소에 해당하는 객실 CRUD
    * 객실에 해당하는 객실 옵션 CRUD
  * 숙소 필터 (인원, 숙소 종류, 별점 등) 검색 기능 구현
  * 페이지네이션 기능 구현
  
**5. 느낀 점** <br/>

* 어려웠던 점 <br/>
📌 숙소 등록 과정에서 숙소 사진이 여러 개인 점을 어떻게 반영해야 할지 고민이 됬다. <br/>
✔ 검색을 통해 다중 파일 업로드 기능을 구현하는 코드를 이해했고, 단일 파일 업로드와 다중 파일 업로드 기능을 클래스로 만들어 재사용이 가능하게 적용했다. <br/><br/>
📌 숙소 검색 과정에서 인원, 숙소 종류, 별점 등의 필터링과 페이지 네이션 기능을 구현해야 하는데 감이 잡히지 않아 난감했다. <br/>
✔  SQL 문 안에 choose, when 등 조건문을 주어 여러 개의 테이블을 조인하여 데이터를 가져왔고, 페이징 클래스를 만들어 페이지 네이션 기능을 구현했다.

* 배운 점 <br/>
💡 Table 관계에 대한 이해 및 SQL 문 관련 역량(5개 이상의 테이블 조인 등) <br/>
💡 요구사항과 관계에 근거하여 DB를 설계하는 능력 <br/>
💡 관리자와 사용자의 UI, 기능 분리 <br/>
💡 협업에서 중요한 팀워크, 의사소통능력, 문제해결 능력 <br/>

**6. 관련 문서** <br/>

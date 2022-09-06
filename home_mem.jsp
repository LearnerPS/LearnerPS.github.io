<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>회 원 관 리</title>
	<script type="text/javascript">
	
	</script>
</head>
<body>
	<h1>회 원 관 리</h1>
	<c:if test="${ sessionScope.myinfo != null }">
	회원ID: ${ sessionScope.myinfo.userid } / 회원이름: ${ sessionScope.myinfo.username } / 
	연락처: ${ sessionScope.myinfo.tel}
	</c:if>
	
	
	<c:if test="${ sessionScope.myinfo == null }">
		<p>- <a href="mem/insert_form">회원등록</a></p>
		<p>- <a href="mem/login_form">로그인</a></p>
	</c:if>
	
	<c:if test="${ sessionScope.myinfo != null }">
		<p>- <a href="mem/logout_action" onclick="return confirm('로그아웃 하시겠습니까?');">로그아웃</a></p>
		<p>- 정보수정(만들어보기 -암호를 다시한번더 확인, id제외 암호도 정보 수정가능케)</p>
		<p>- 회원탈퇴(만들어보기)</p>
	</c:if>
	
	
</body>
</html>

***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>로 그 인 화 면</title>
	<style type="text/css">
	.msg{ color: red; font-weight: bold; }
	</style>
</head>
<body>
	<h1>로 그 인 화 면</h1>
	<p>
		<a href="../">홈</a>
	</p>
	<c:if test="${msg.length() != 0}"> <!-- msg변수가 존재하면 -->
	<p class="msg">${msg}</p>
	</c:if>
	<form action="login_action" method="post">
		회원 아이디 <input name="userid" value="${param.userid}">
		<br>
		회원 암호 <input name="userpw">
		<br>
		<input type="submit" value="로 그 인">
	</form>

</body>
</html>


```

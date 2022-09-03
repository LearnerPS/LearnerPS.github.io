***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>회 원 등 록</title>
</head>
<body>
	<h1>회 원 등 록</h1>
	<p>
		<a href="../">홈</a>
	</p>
	<form action="insert_action" method="post">
	회원 아이디 <input name="userid">  <br>
	회원 이  름 <input name="username">  <br>
	회원 비밀번호<input name="userpw">  <br>
	회원 소 개<input name="intro">  <br>
	회원 연락처<input name="tel">  <br>
	<input type="submit" value="회 원 등 록">
	</form>

</body>
</html>

```

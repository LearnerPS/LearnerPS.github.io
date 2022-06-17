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
	<title>할 일 수 정 폼</title>
</head>
<body>
	<h1>할 일 수 정 폼</h1>
	<div>
		<a href="todo.jsp">할일 목록</a>
	</div>
	<br>
	<form action="">
		할일내용: 
		<input type="text" name="todo" value="${ requestScope.todo }">
		<input type="hidden" name="command" value="update_action">
		<input type="hidden" name="no" value="${ param.no }">
		<br>
		<input type="submit" value="할 일 저 장">
	</form>


</body>
</html>

```

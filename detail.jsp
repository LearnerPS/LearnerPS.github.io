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
	<title>할일 등록</title>
</head>
<body>
	<h1>할일 등록</h1>
		<fieldset>
			<legend>할 일 번 호</legend>
			${todo.no}
		</fieldset>
		<fieldset>
			<legend>할 일 제 목</legend>
			${todo.title}
		</fieldset>
		<fieldset>
			<legend>할 일 내 용</legend>
			${todo.todo}
		</fieldset>
		<fieldset>
			<legend>할 일 등록일</legend>
			${todo.regdate}
		</fieldset>
		<fieldset>
			<legend>할 일 종료일</legend>
			${todo.enddate}
		</fieldset>
		
		<a href="list">할 일 목 록</a>
		<br>
		<a href="update_form?no=${todo.no}">할 일 수 정</a>
		<br>
		<a href="delete_form?no=${todo.no}">할 일 삭 제</a>
		<br>

</body>
</html>

```

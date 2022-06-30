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
	<title>할 일 삭 제 폼 2</title>
</head>
<body>
	<h1>할 일 삭 제 폼 2</h1>
	<div>
		<a href="todo_2">할일 목록</a>
	</div>
	<br>
	<form action="todo_2_delete_action">
		할일제목: 
		<input type="text" name="title" value="${ todo.title }">
		<br>
		할일내용: 
		<input type="text" name="todo" value="${ todo.todo }">
		<input type="hidden" name="no" value="${ param.no }">
		<br>
		<input type="submit" value="할 일 삭 제">
	</form>


</body>
</html>

```

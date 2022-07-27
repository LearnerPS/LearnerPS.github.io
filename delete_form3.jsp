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
	<title>할일 삭제</title>
</head>
<body>
	<h1>할일 삭제</h1>
	<form action="delete_action" method="post">
		<label>
			할 일 제 목:
			<input type="hidden" name="no" value="${todo.no}">	
			<input type="text" name="title" value="${todo.title}" readonly="readonly">	
		</label><br>
		
		<label>
			할 일 내 용:
			<input type="text" name="todo" value="${todo.todo}" readonly="readonly">	
		</label><br>
		<label>
			등 록 일:
			<input type="date" name="regdate" value="${todo.regdate}" readonly="readonly">	
		</label><br>
		<label>
			종 료 일:
			<input type="date" name="enddate" value="${todo.enddate}" readonly="readonly">	
		</label><br>
		<input type="submit" value="할일 삭제 하기">
		<a href="list">할 일 목 록</a>
	</form>

</body>
</html>

```

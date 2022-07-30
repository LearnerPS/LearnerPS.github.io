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
	<title>할일 목록</title>
</head>
<body>
	<h1>할일 목록</h1>
	<div>
		<a href="insert_form">할 일 등 록</a>
	</div>
	<div>
		저장 갯수: ${ todo_list.size() }
	</div>
	<h2>목 록</h2>
	<table border="1">
		<tr>
			<th>번호</th>
			<th>제목</th>
		</tr>
		<c:forEach items="${ todo_list }" var="todo">
		<tr>
			<td>${todo.no}</td>
			<td><a href="detail?no=${todo.no}">${todo.title}</a> </td>
		</tr>
		</c:forEach>
	</table>

</body>
</html>

```

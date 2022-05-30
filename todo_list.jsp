***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
ArrayList<String> todoList = (ArrayList<String>)application.getAttribute("todolist");

%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>할일 목록</title>
</head>
<body>
	<h1>할일 목록</h1>
	<a href="todo.jsp?command=insert_form">할 일 등 록</a>
	<br>
	<h2>저장갯수: <%= todoList.size() %> </h2>
	<h3>할일목록</h3>
	<ul>
	<%
	for(int i=0; i<todoList.size(); i++) {
	%>
		<li><%= todoList.get(i) %>
		<a href="todo.jsp?command=update_form&no=<%= i %>">수정</a> / 
		<a href="todo.jsp?command=delete_action&no=<%= i %>">삭제</a>
		</li>
	<% } %>
	</ul>
	
	
</body>
</html>

```

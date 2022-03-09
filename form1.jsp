***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>폼 응답</title>
	</head>
	<body>
		오늘 날짜: <%= new java.util.Date() %>  <br>
		<h1>응답:</h1>
		<h2> <%= request.getParameter("memid") %>   </h2>
		<h2> <%= request.getParameter("mempw") %>   </h2>
		<h2> <%= request.getParameter("color") %>   </h2>
	
	</body>
</html>

```

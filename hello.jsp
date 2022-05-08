***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	int count = 0; //선언 -> 변수생성
%>

	<%
	count++;
	int cnt = 0; //_jspService()내부. 지역변수 생성.
	cnt++;
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello JSP</h1>
	<h1>count =  <%= count %></h1>
	<h1>cnt =  <%= cnt %></h1>

</body>
</html>

```

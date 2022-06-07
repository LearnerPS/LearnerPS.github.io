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
	<title>리다이렉트 연습</title>
</head>
<body>
	<h1>리다이렉트 연습</h1>
	<%
	//웹게시물 등록이후 목록으로 자동 이동
	//단점: 수신된 파라미터를 전달 불가. 일일이 지정하기
	response.sendRedirect("a.jsp");
	%>
</body>
</html>

```

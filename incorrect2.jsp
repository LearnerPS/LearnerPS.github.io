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
	<title>오답입니다. 당신은 바보입니까?</title> 
</head>
<body>
	<h1>오답입니다. 당신은 바보입니까?</h1>
	<h2>게이머이름: <%= application.getAttribute("nick_name") %> </h2>
	<h2>시도횟수: <%= application.getAttribute("count") %> / <%= application.getAttribute("max_count") %></h2> 

	<div style="font-size: xx-large;">오답입니다. 당신은 바보입니까?</div>
	<div style="font-size: xx-large;">
		<a href="brain_training.jsp">게 임 다 시 하 기</a>
	</div>
	
</body>
</html>


```

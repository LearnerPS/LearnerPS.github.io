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
	<title>추카추카~ 레벨통과~</title> 
</head>
<body>
	<h1>축하합니다. 레벨을 통과했습니다</h1>
	<h2>게이머이름: <%= application.getAttribute("nick_name") %> </h2>
	<h2>시도횟수: <%= request.getAttribute("count") %> / <%= application.getAttribute("max_count") %></h2> 

	<div style="font-size: xx-large;">축하합니다. 레벨을 통과했습니다</div>
	<div style="font-size: xx-large;">
		<a href="brain_training.jsp">게 임 다 시 하 기</a>
	</div>
	
</body>
</html>


```

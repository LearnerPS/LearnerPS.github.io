***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	int num1, num2; //난수 2개
	String opr; // 연산자 저장
%>
<%
	//난수 1~20사이 난수 2개 생성
	// +, -, * 연산자중 하나 저장
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>두뇌 훈련 게임</title>
</head>
<body>
	<h1>두뇌 훈련 게임</h1>
	<form action="">
		<input name="num1" value="${num1}">
		<input name="opr" value="${opr}">
		<input name="num2" value="${num1}">
		 = 
		<input name="answer">
		<input type="submit" value="<정답확인>">
	</form>
	
</body>
</html>

```

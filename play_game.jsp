***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	int num1, num2; //난수 2개
	String opr; // 연산자 저장
	long startTime; //게임 시작 시간
	long endTime; // 게임 종료 시간
%>
<%
	// 게이머이름 설정
	startTime = System.currentTimeMillis();//1970.1.1 0시부터 지금까지 걸린 밀리초

	//난수 1~20사이 난수 2개 생성
	num1 = (int)(Math.random()*20)+1; // 1~20
	// +, -, * 연산자중 하나 저장
	String[] oprArr = {"+","-","*"}; // 0,1,2
	int opr_idx = (int)(Math.random()*3); // 0~2
	opr = oprArr[ opr_idx ];
	
	// 연산자가 * 이면 num2는 1~10사이 숫자로 지정
	if(opr_idx == 2)
		num2 = (int)(Math.random()*10)+1; // 1~10
	else
		num2 = (int)(Math.random()*20)+1; // 1~20
	
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>두뇌 훈련 게임</title> 
</head>
<body>
	<h1>두뇌 훈련 게임</h1>
	<h2>게이머이름: <%= application.getAttribute("nick_name") %> </h2>
	<h2>시도횟수: <%= request.getAttribute("count") %> / <%= application.getAttribute("max_count") %></h2> 

	<form action="">
		<input type="hidden" name="count" value="<%= application.getAttribute("count") %>">
		<input type="hidden" name="command" value="play">
		<input name="num1" value="<%= num1 %>" readonly="readonly" size="5">
		<input name="opr" value="<%= opr %>" readonly="readonly" size="5">
		<input name="num2" value="<%= num2 %>" readonly="readonly" size="5">
		 = 
		<input name="answer" size="5">
		<input type="submit" value="<정답확인>">
	</form>

	<fieldset>
		<legend>계 산 결 과</legend>
		<textarea rows="10" cols="55"><%= request.getAttribute("result") %></textarea>
	</fieldset>
	
</body>
</html>

```

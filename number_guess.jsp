***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
int com_num = -1; //컴 난수 저장용
String result = ""; //결과 누적용
%>

<%
if(com_num == -1){ //난수 초기화 안됨
	com_num = (int)(Math.random()*100)+1;
}

String user_num = "";
user_num = request.getParameter("num");
try{
	int n = Integer.parseInt(user_num);
	if(n > com_num){
		result = user_num+" 낮춰주세요 \n" + result;
	}
	else if(n < com_num){
		result = user_num+" 높여주세요 \n" + result;
	}
	else if(n == com_num){
		result = user_num+" 정답입니다 \n" + result;
	}
}catch(Exception r){
}
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>숫자맞추기 jsp</title>
</head>
<body>
	<h1>숫자맞추기 jsp</h1>
	<h2>1~100사이 숫자를 맞춰 보세요</h2>
	<form action ="number_guess.jsp">
		<input name="num">
		<input type="submit" value="정답확인">
	</form>
	<fieldset>
		<legend>확 인 결 과</legend>
		<textarea rows="10" cols="60"><%= result %></textarea>
	</fieldset>
</body>
</html>

```

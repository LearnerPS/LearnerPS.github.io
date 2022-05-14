***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String num1 = request.getParameter("num1");
String num2 = request.getParameter("num2");
String opr = request.getParameter("opr");
String result = "";

try{
	int n1 = Integer.parseInt(num1);
	int n2 = Integer.parseInt(num2);
	
	if(opr.equals("+")) {
		result = n1 + n2+"";
	}else if(opr.equals("-")) {
		result = n1 - n2+"";
	}else if(opr.equals("*")) {
		result = n1 * n2+"";
	}else if(opr.equals("/")) {
		result = 1.0*n1 / n2+""; //소수점이하 살리기
	}
}catch(Exception r){

}
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>초간단 계산기 JSP</title>
</head>
<body>
	<h1>초간단 계산기</h1>
	<form action="simple_calc.jsp">
		<input name="num1" placeholder="첫번째 숫자 입력" value="${ num1 }">
		<select name="opr">
			<option>+
			<option>-
			<option>*
			<option>/
		</select>
		<input name="num2" placeholder="두번째 숫자 입력" value="${ nuWm2 }">
		<input type="submit" value="계산하기">
	</form>
	<fieldset>
		<legend>계산결과</legend>
		<input  value="<%= result %>">
	</fieldset>

</body>
</html>

```

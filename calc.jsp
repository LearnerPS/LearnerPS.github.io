***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>초간단 계산기</title>
</head>
<body>
	<h1>초간단 계산기</h1>
	
	<form action="calc_action">
		<input type="number" name="num1" size="5">
		<select name="opr">
			<option>+
			<option>-
			<option>*
			<option>/
		</select>
		<input type="number" name="num2" size="5">
		<input type="submit" value=" = ">
	</form>
	<div>
	<c:if test="${ result.length() > 0 }">
	${param.num1} ${param.opr} ${param.num2} =  ${result}
	</c:if>	
	</div>
	
</body>
</html>


```

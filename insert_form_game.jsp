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
	<title>숫자 맞추기 for Spring FW</title>
</head>
<body>
	<h1>숫자 맞추기 for Spring FW</h1>
	<h2>1 ~ 100사 컴퓨터의 숫자를 맞춰보세요</h2>
	
	<c:if test="${ msg.length() > 0  }">
	MSG = ${msg}
	</c:if>
	
	<form action="number_check">
	<label>
		숫자를 입력하세요
		<input type="number" name="user_num">
		<input type="submit" value="정답확인">
	</label>
	</form>

</body>
</html>

```

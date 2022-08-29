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
	<title>오늘의 로또 번호</title>
</head>
<body>
	<h1>오늘의 로또 번호</h1>
	
	<form action="lotto_action">
		<input type="submit" value="추천번호 생성">
	</form>
	
	<c:if test="${ lotto.size() == 6 }">
	<div>
		<h2>오늘의 로또번호는</h2>
		<h2>${ lotto }</h2> <!-- 한꺼번에 출력 -->
	</div>
	
	<div><!-- 하나씩 출력 -->
	<c:forEach items="${ lotto }" var="num" varStatus="st">
		<h3>${st.index + 1}번째  =  ${ num }</h3>
	</c:forEach>
	</div>
	
	</c:if>

</body>
</html>


```

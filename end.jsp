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
	<title>레 벨 통 과</title>
</head>
<body>
	<div style="font-size: xx-large;">축하합니다. 레벨을 통과했습니다.
		<br>
		게임시간은 <%= request.getAttribute("gameTime") %>초입니다
		<br>
		<a href="brain_training.jsp">게임 다시 하기</a>
		<br>
		<br>
	</div>

</body>
</html>

```

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
	<title>두뇌 훈련 게임</title>
</head>
<body>
	<h1>두뇌 훈련 게임</h1>
	<form action="brain_training_play.jsp">
		게이머 이름 입력:
		<input name="nick_name">
		<input type="submit" value="<게임시작>">
		<br>
		<fieldset>
			<legend>도전 레벨</legend>
			<label>
				<input type="radio" name="level" value="5" checked="checked">초 급
			</label>
			<label>
				<input type="radio" name="level" value="10">중 급
			</label>
			<label>
				<input type="radio" name="level" value="20">고 급
			</label>
		</fieldset>
	</form>

</body>
</html>

```

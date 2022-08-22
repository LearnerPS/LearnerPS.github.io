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
	<title>파일 업로드 화면</title>
</head>
<body>
	<h1>파일 업로드 화면</h1>

	<form action="upload_action" 
			method="post"
			enctype="multipart/form-data">
		업로드 파일: <input type="file" name="uploadFile">
		<br>
		등록자 이름: <input type="text" name="uploader_name">
		<br>
		<input type="submit" name="업로드">	
	</form>


</body>
</html>


```

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
	<title>할 일 검 색 목 록</title>
	<style type="text/css">
	a { text-decoration: none; }
	a:hover { text-decoration: underline; }
	</style>
</head>
<body>
	<h1>할 일 검 색 목 록</h1>
	
	<a href="insert_form">글 등 록</a>
	<hr>
	저장갯수: ${ todo_count }
	<h2>목록</h2>
	<table border="1">
	  <tr>
	    <th>번호</th>
	    <th>제목</th>
	  </tr>
	  <c:forEach items="${todo_list}" var="todo">
	  <tr>
	    <td>${todo.no}</td>
	    <td><a href="detail?no=${todo.no}&pno=${param.pno == null ? 1 : param.pno}">${todo.title}</a></td>
	  </tr>
	  </c:forEach>
	  
	</table>
	
	<hr>
	<div id="page_nav_bar">
		<c:if test="${ pageNavi[0] != 1 }">
			<a href="search?pno=${pageNavi[0]-1}&target=${param.target}&word=${param.word}">이전</a>
		</c:if>
		
		<c:forEach items="${pageNavi}" var="pageNo">
			<c:if test="${param.pno == pageNo}"> [ </c:if>
			<a href="search?pno=${pageNo}&target=${param.target}&word=${param.word}">${pageNo}</a> 
			<c:if test="${param.pno == pageNo}"> ] </c:if>
		</c:forEach>
		
		<c:if test="${ pageNavi[pageNavi.size()-1] < pageNavigator.maxPage  }">
			<a href="search?pno=${pageNavi[pageNavi.size()-1] + 1}&target=${param.target}&word=${param.word}">다음</a>
		</c:if>
	</div>
	<hr>
	<div id="search">
		<form action="search">
			<label>검색대상
				<select name="target">
					<option value="title">제 목</option>
					<option value="todo"  ${param.target=='todo' ? "selected" : ""} >내 용</option>
				</select>
			</label>
			<label>
				검색어 <input name="word" value="${param.word}">
			</label>	
			<input type="submit" value="검 색">
		</form>
	</div>
	
</body>
</html>



```

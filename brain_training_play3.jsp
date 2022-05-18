***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	int num1, num2; //난수 2개
	String opr; // 연산자 저장
	String nick_name ; //게이머 플레이 이름
	int max_count = 5;//최대시도횟수.   초급:5  중급:10, 고급:20
	int count = 0;//게임 시도 횟수
	long startTime; //게임 시작 시간
	long endTime; // 게임 종료 시간
%>
<%
	count++; 
	// 게이머이름 설정
	String nick_name = request.getParameter("nick_name"); 
	if(nick_name != null){
		count = 1;
		this.nick_name = nick_name;
		max_count = Integer.parseInt(request.getParameter("level"));
		startTime = System.currentTimeMillis();//1970.1.1 0시부터 지금까지 걸린 밀리초
	}
	// 정답확인
	String result = "정답입니다";
	if(count != 1){ // 첫화면인 경우 생략
		int n1 = Integer.parseInt( request.getParameter("num1") );
		int n2 = Integer.parseInt( request.getParameter("num2") );
		String opr1 = request.getParameter("opr"); 
		int ans = Integer.parseInt( request.getParameter("answer") );
		
		if(opr1.equals("+")){
			result = ((n1+n2) == ans ? "정답입니다":"오답입니다. 당신은 바보입니까?"); // true / false
		}else if(opr1.equals("-")){
			result = ((n1-n2) == ans ? "정답입니다":"오답입니다. 당신은 바보입니까?"); // true / false
		}else if(opr1.equals("*")){
			result = ((n1*n2) == ans ? "정답입니다":"오답입니다. 당신은 바보입니까?"); // true / false
		} 
	}


	//난수 1~20사이 난수 2개 생성
	num1 = (int)(Math.random()*20)+1; // 1~20
	num2 = (int)(Math.random()*20)+1; // 1~20
	// +, -, * 연산자중 하나 저장
	String[] oprArr = {"+","-","*"}; // 0,1,2
	int opr_idx = (int)(Math.random()*3); // 0~2
	opr = oprArr[ opr_idx ];

	
	if( count > max_count ){ //최대시도횟수 초과. 해당 레벨 통과
		endTime = System.currentTimeMillis();
		int gameTime = (int)(endTime - startTime)/1000; //초단위 
		
		request.setAttribute("gameTime", gameTime);
		pageContext.forward("end.jsp");

	}else if(result.contains("오답입니다")){ //오답인 경우
		pageContext.forward("incorrect.jsp");
	}
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>두뇌 훈련 게임</title> 
</head>
<body>
	<h1>두뇌 훈련 게임</h1>
	<h2>게이머이름: <%= nick_name %> </h2>
	<h2>시도횟수: <%= count %> / <%= max_count %></h2> 


	<form action="">
		<input type="hidden" name="count" value="<%= count %>">
		<input name="num1" value="<%= num1 %>" readonly="readonly" size="5">
		<input name="opr" value="<%= opr %>" readonly="readonly" size="5">
		<input name="num2" value="<%= num2 %>" readonly="readonly" size="5">
		 = 
		<input name="answer" size="5">
		<input type="submit" value="<정답확인>">
	</form>


	<fieldset>
		<legend>계 산 결 과</legend>
		<textarea rows="10" cols="55"><%= result %></textarea>
	</fieldset>
	
	
</body>
</html>


```

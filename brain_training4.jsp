***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%!
String nick_name; //게이머 이름
int max_count = 5; //초,중,고급
int count = 0;//게임 시도 횟수

%>

<%
String command = request.getParameter("command");

//제일 처음 호출하면 게이머이름 입력 화면 보여주기
if(command == null){
	pageContext.forward("input_name.jsp");
}else if(command.equals("input_nick_name")){ // 게이머이름 설정
	nick_name = request.getParameter("nick_name");
	application.setAttribute("nick_name", nick_name);
	max_count = Integer.parseInt(request.getParameter("level"));
	application.setAttribute("max_count", max_count);
	count = 1;
	request.setAttribute("count", count);
	request.setAttribute("result", "");//첫페이지의 계산결과에 null 표시 방지용
	pageContext.forward("play_game.jsp");
}else if(command.equals("play")){ // 게임중.정답체크
	// 정답확인
	String result = "정답입니다";
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
	//요청할 때마다 바뀌는것은 request에 저장
	request.setAttribute("result", result);
	count++;
	request.setAttribute("count", count);
	//정답화면과 오답화면 다르게
	if(result.contains("정답")){
		//count가 max_count넘으면 레벨 통과
		if(count > max_count){
			pageContext.forward("end_game.jsp"); //레벨통과
		}else{
			pageContext.forward("play_game.jsp"); //게임 계속
		}
	}else{
		pageContext.forward("incorrect.jsp");
	}
}
%>    

<h1>잘못된 처리입니다</h1>

```

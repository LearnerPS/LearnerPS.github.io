***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%!int count = 0; //시도횟수
	int num1 = 0;
	int op = 0;
	String opr = "";
	int num2 = 0;
	int cnt = 0;// 무한 반복 방지
	String dis = "";
	int result = 0;
	long beforeTime = System.currentTimeMillis();
	long afterTime = 0;%>

<%
if (cnt == 0) {
	num1 = (int) (Math.random() * 20) + 1;
	num2 = (int) (Math.random() * 20) + 1;
	op = (int) (Math.random() * 3) + 1;
	count++;
	cnt = -1;

	if (op == 1) {
		opr = "+";
	} else if (op == 2) {
		opr = "-";
	} else if (op == 3) {
		opr = "*";
	}
}
String num = request.getParameter("anspl");
if (num == null){
	num = "";
	count=0;
}

try {
	int user_num = Integer.parseInt(num);
	if (opr.equals("+")) {
		result = num1 + num2;
	} else if (opr.equals("-")) {
		result = num1 - num2;
	} else if (opr.equals("*")) {
		result = num1 * num2;
	}
	if (result == user_num && count == 20) {
		
		afterTime = System.currentTimeMillis();
		long secDiffTime = (afterTime - beforeTime) / 1000;
		dis ="완벽!"+"\n"+"걸린시간: "+ secDiffTime + "ms";
		count=0;
	}else if (result == user_num) {
		dis = "정답입니다.";
		cnt = 0;
	} else {
		dis = "당신은 바보입니까?";
		count = 0;
	}
} catch (Exception e) {
	e.printStackTrace();
}
%>
<html>

  <head>
<script type="text/javascript"
	src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script type="text/javascript">
	// 선언부
	function New() {
		<%num1 = (int) (Math.random() * 20) + 1;
		num2 = (int) (Math.random() * 20) + 1;
		op = (int) (Math.random() * 3) + 1;
		count++;
		cnt = -1;

		if (op == 1) {
			opr = "+";
		} else if (op == 2) {
			opr = "-";
		} else if (op == 3) {
			opr = "*";
		}%>

	$(function() {
		if(count!=5){
			$("#in").click(New)
		}
		}
		
	})

  </script>
<meta charset="UTF-8">

  <title>말랑 말랑 두뇌 트레이닝</title>

  </head>

  <body>
	<h1>말랑 말랑 두뇌 트레이닝</h1>
	<h2>
		현재 계산횟수 :
		<%=count%>/20
	</h2>
	<fieldset>
		<legend>확 인 결 과</legend>
		<form id=display action="">
			<input name="num1" value=<%=num1%>> <input name="opr"
				value=<%=opr%>> <input name="num2" value=<%=num2%>>
			= <input name="anspl"> <input id="in" type="submit" value="전송">
		</form>
		<textarea rows="5" cols="10"><%=dis%></textarea>
	</fieldset>

  </body>

</html>

```

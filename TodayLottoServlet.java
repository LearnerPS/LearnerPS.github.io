***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package sesac.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TodayLottoServlet
 */
@WebServlet("/today_lotto")
public class TodayLottoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
/*
 * 퀴즈:  "/today_lotto"  요청시  
    로또번호 6개(숫자중복안됨) 화면에 표시하는 서블릿 작성
    서블릿 TodayLottoServlet
 */
	
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		TreeSet<Integer> set = new TreeSet<Integer>();
		while(set.size() < 6) {
			set.add(  (int)(Math.random()*45)+1    );
		}
		
		response.setContentType("text/html; charset=utf-8");
		
		response.getWriter().append( "<!DOCTYPE html>" );
		response.getWriter().append( "<html>" );
		response.getWriter().append( "<head>" );
		response.getWriter().append( "	<style>" );
		response.getWriter().append( "	ul{ list-style: none;  }" );
		response.getWriter().append( "	</style>" );
		response.getWriter().append( "	<title>오늘의 로또번호</title>" );
		response.getWriter().append( "</head>" );
		response.getWriter().append( "<body>" );
		response.getWriter().append( "	<h1>오늘의 로또번호</h1>" );
		response.getWriter().append( "	<ul>" );
		ArrayList<Integer> list = new ArrayList<Integer>(set);
		for (Integer i : list) {
			response.getWriter().append( "		<li>"+i+"</li>" );
		}
		response.getWriter().append( "	</ul>" );
		response.getWriter().append( "</body>" );
		response.getWriter().append( "</html>" );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

```

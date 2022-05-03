***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package sesac.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleCalcServlet
 */
@WebServlet("/simple_calc")
public class SimpleCalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		String opr = request.getParameter("opr");
		
		int n1 = Integer.parseInt(num1);
		int n2 = Integer.parseInt(num2);
		String result = "";
		if(opr.equals("+")) {
			result = n1 + n2+"";
		}else if(opr.equals("-")) {
			result = n1 - n2+"";
		}else if(opr.equals("*")) {
			result = n1 * n2+"";
		}else if(opr.equals("/")) {
			result = 1.0*n1 / n2+""; //소수점이하 살리기
		}
		
		response.getWriter().append( result );
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

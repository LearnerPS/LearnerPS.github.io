***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package game_04.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NumberGuessController {
	
//	private int com_num= 0;
	
	@RequestMapping("/number_guess") //숫자입력화면
	public String number_guess(HttpSession httpss ) {
		
		Object o = httpss.getAttribute("com_num");
		
		if(o == null) { // 컴퓨터 난수가 없는 상태. 처음 접근한 경우
			int com_num = (int)(Math.random()*100+1); //난수생성
			httpss.setAttribute("com_num", com_num);  //난수 저장
			System.out.println("난수저장: "+com_num);
		}
		
		return "number_guess/insert_form"; //숫자입력화면
	}
	@RequestMapping("/number_check") //정답확인
	public String number_check(
			@RequestParam("user_num") int user_num,
			Model model, HttpSession httpss) {
		
		int com_num = (Integer)httpss.getAttribute("com_num");
		
		String msg="";
		if(com_num==user_num) {
			msg = "추카추카~";
		}else if(com_num < user_num) {
			msg="낮춰주세요";
		}else {
			msg="높여주세요";
		}
		model.addAttribute("msg",msg);
		
		return "number_guess/insert_form";
	}
}


```

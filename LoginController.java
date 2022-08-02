***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package game_04.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@RequestMapping("/main")
	public String main(HttpSession httpss) {
		
		//로그인여부검사
		Object userid = httpss.getAttribute("userid");
		if( userid == null ) { //저장안됨
			return "login_form";
		}
		
		return "main";
	}
	
	@RequestMapping("/login_action")
	public String login_action(
			@RequestParam("userid") String userid,
			@RequestParam("userpw") String userpw,
			HttpSession httpss) {
		
		//암호검사 했다치고....
		httpss.setAttribute("userid", userid);
		
		return "redirect:/main";
	}

	@RequestMapping("/logout_action")
	public String logout_action(HttpSession httpss) {
		
		httpss.removeAttribute("userid");
		
		return "redirect:/main";
	}
}

```

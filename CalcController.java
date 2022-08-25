***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package org.sesac.paging_05.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalcController {
	
	@RequestMapping("/calc")
	public String calc() {
		
		return "calc";
	}
	
	@RequestMapping("/calc_action")
	public String calc_action(
		@RequestParam("num1") int num1,	
		@RequestParam("num2") int num2,	
		@RequestParam("opr") String opr,
		Model model
		) {
		
		String result = "";
		if(opr.equals("+")) {
			result = num1 + num2 +"";
		}else if(opr.equals("-")) {
			result = num1 - num2 +"";
		}else if(opr.equals("*")) {
			result = num1 * num2 +"";
		}else if(opr.equals("/")) {
			result = 1.0*num1 / num2 +"";
		}
		
		model.addAttribute("result", result);
		
		return "calc";
	}
}


```

***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package org.sesac.paging_05.controller;

import java.util.TreeSet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LottoController {
	
	@RequestMapping("/lotto_form")
	public String lotto_form() {
		
		return "lotto";
	}
	
	@RequestMapping("/lotto_action")
	public String lotto_action(Model model) {
		// 로또번호생성
		// 뷰로 전달 => Model model
		TreeSet<Integer> set = new TreeSet<Integer>();
		while (set.size() < 6) {
			set.add( (int)(Math.random()*45+1) );
		}
		model.addAttribute("lotto", set);
		
		return "lotto";
	}
}


```

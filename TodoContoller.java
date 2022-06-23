
***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package org.sesac.spring;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoContoller {

	private ArrayList<String> todo_list = new ArrayList<String>();
	
	@RequestMapping("/todo")
	public String todo(Model model) {
		
		model.addAttribute("todo_list", todo_list);
		
		return "todo/list"; //포워딩
	}//end todo
	
	@RequestMapping("/todo_insert_form")
	public String todo_insert_form() {
		
		return "todo/insert_form";//할일 등록 양식
	}
	
	@RequestMapping("todo_insert_action")
	public String todo_insert_action( @RequestParam("todo") String todo ) {
		
		todo_list.add(todo);
		
		return "todo/insert_action"; //  등록 결과 페이지 보이기
//		return "redirect:/todo"; //   등록 결과 페이지안보고  /todo로 주소 변경
	}
	
	@RequestMapping("/todo_update_form")
	public String todo_update_form(@RequestParam("no") int no, Model model) {
		
		String todo = todo_list.get(no);
		model.addAttribute("todo", todo); //jsp에게 전달
		
		return "todo/update_form";
	}
	@RequestMapping("todo_update_action")
	public String todo_update_action(
			@RequestParam("todo") String todo,
			@RequestParam("no") int no
			) {
		
			todo_list.set(no, todo);
		
		return "redirect:/todo"; //목록으로 바로 넘어감
	}
	@RequestMapping("/todo_delete_form")
	public String todo_delete_form(@RequestParam("no") int no,Model model) {
		
		String todo = todo_list.get(no);
		model.addAttribute("todo", todo);
		
		return "todo/delete_form";//할일 삭제 양식
	}

}


```

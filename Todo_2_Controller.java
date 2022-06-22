***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package org.sesac.spring;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Todo_2_Controller {
	
	private ArrayList<TodoVo> todo_list = new ArrayList<TodoVo>();

	@RequestMapping("/todo_2") // 제목이 있는 할일
	public String todo_2(Model model) {
		
		model.addAttribute("todo_list", todo_list);

		return "todo_2/list";
	}
	
	@RequestMapping("/todo_2_insert_form")
	public String todo_2_insert_form() {
		
		return "todo_2/insert_form";//할일 등록 양식
	}
	@RequestMapping("todo_2_insert_action")
	public String todo_insert_action( 
			@RequestParam("todo") String todo ,
			@RequestParam("title") String title
			) {
		
		TodoVo t = new TodoVo();
		t.setTitle(title);
		t.setTodo(todo);
		
		todo_list.add(t);
		
		return "redirect:/todo_2"; //   등록 결과 페이지안보고  /todo로 주소 변경
	}
	@RequestMapping("/todo_2_update_form")
	public String todo_update_form(@RequestParam("no") int no, Model model) {
		
		TodoVo todo = todo_list.get(no);
		model.addAttribute("todo", todo); //jsp에게 전달
		
		return "todo_2/update_form";
	}
	
	@RequestMapping("todo_2_update_action")
	public String todo_update_action(
			@RequestParam("title") String title,
			@RequestParam("todo") String todo,
			@RequestParam("no") int no
			) {
			TodoVo vo = todo_list.get(no); //기존객체 추출
			vo.setTitle(title);  // 제목 수정
			vo.setTodo(todo);  // 내용 수정
		
		return "redirect:/todo_2"; //목록으로 바로 넘어감
	}
	@RequestMapping("/todo_2_delete_form")
	public String todo_delete_form(@RequestParam("no") int no, Model model) {
		
		TodoVo todo = todo_list.get(no);
		model.addAttribute("todo", todo);
		
		return "todo_2/delete_form";//할일 삭제 양식
	}
	@RequestMapping("/todo_2_delete_action")
	public String todo_2_delete_action(@RequestParam("no") int no) {
		
		todo_list.remove(no);
		
		return "redirect:/todo_2";//할일 삭제 후 바로 목록으로
	}

}


```

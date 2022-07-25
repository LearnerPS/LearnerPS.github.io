***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package org.sesac.spring_mybatis_2.controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.sesac.todo.vo.TodoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {

	@Autowired
	private SqlSession session;
	
	@RequestMapping("/todo/list")
	public String todo_list(Model model) {
		
		String ns = "org.sesac.mappers.todo";
		List<TodoVo> list = session.selectList( ns +".selectAll");
//		System.out.println("저장갯수: "+list.size());
		model.addAttribute("todo_list", list);
		
		return "todo/list";
	}
	
	@RequestMapping("/todo/insert_form")
	public String insert_form() {
		
		return "todo/insert_form";
	}
	@RequestMapping("/todo/insert_action")
	public String insert_action( TodoVo vo ) {
		
		String ns = "org.sesac.mappers.todo";
		session.insert(ns+".insert", vo);
		
//		return "todo/insert_action"; //  jsp만들어야함
		return "redirect:/todo/list"; // 리다이렉션
	}
	@RequestMapping("/todo/update_action")
	public String update_action( TodoVo vo ) {
		
		String ns = "org.sesac.mappers.todo";
		session.update(ns+".update", vo);
		
//		return "todo/insert_action"; //  jsp만들어야함
		return "redirect:/todo/list"; // 리다이렉션
	}
	
	@RequestMapping("/todo/detail")
	public String detail(@RequestParam("no") int no, Model model) {
		
		String ns = "org.sesac.mappers.todo";
		TodoVo vo = session.selectOne( ns +".select", no);
		model.addAttribute("todo", vo);
		
		return "todo/detail";
	}
	@RequestMapping("/todo/update_form")
	public String update_form(@RequestParam("no") int no, Model model) {
		
		String ns = "org.sesac.mappers.todo";
		TodoVo vo = session.selectOne( ns +".select", no);
		model.addAttribute("todo", vo);
		
		return "todo/update_form";
	}
	@RequestMapping("/todo/delete_form")
	public String delete_form(@RequestParam("no") int no, Model model) {
		
		String ns = "org.sesac.mappers.todo";
		TodoVo vo = session.selectOne( ns +".select", no);
		model.addAttribute("todo", vo);
		
		return "todo/delete_form";
	}
	@RequestMapping("/todo/delete_action")
	public String delete_action(@RequestParam("no") int no, Model model) {
		
		String ns = "org.sesac.mappers.todo";
		session.delete( ns +".delete", no);
		
		return "redirect:/todo/list"; // 리다이렉션

	}
}

```

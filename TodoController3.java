***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package org.sesac.todo_04.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.sesac.todo_04.exception.TodoNotFoundException;
import org.sesac.todo_04.util.PageNavigator;
import org.sesac.todo_04.vo.TodoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class TodoController {

	@Autowired
	private SqlSession session; // sqlSessionTemplate이 연결됨
	
	// 할일 목록
	@RequestMapping("/todo/list")
	public String todo_list(
			@RequestParam( value="pno",required = false, defaultValue = "0" ) int pno,
			Model model) {
		
		if( pno == 0 ) { // pno없이 접근
			return "redirect:/todo/list?pno=1";
		}
		
		int rowPerPage = 3 ; //페이지당 보여줄 게시물 수
		int pagePerGrp = 4 ; //하단 보여줄 페이지번호 갯수 
		
		HashMap<String,Integer> map = new HashMap<String, Integer>();
		int startNo = (pno-1) * rowPerPage ;
		map.put("startNo", startNo);
		map.put("size", rowPerPage );
		
		String ns = "org.sesac.config.mappers.todo";
		List<TodoVo> list = session.selectList(ns+".selectAll", map);
		model.addAttribute("todo_list", list);
		
		PageNavigator pnavi = new PageNavigator();//하단 페이지번호 목록 생성
		pnavi.setRowPerPage(rowPerPage);//페이지당 보여줄 게시물 수
		pnavi.setPagePerGrp(pagePerGrp);//하단 보여줄 페이지번호 갯수 
		pnavi.setCurrentPageNo(pno);
		
		// 총게시물 수 추출
		int todo_count = session.selectOne(ns+".count");
		model.addAttribute("todo_count", todo_count);
		
		pnavi.setTotalRow(todo_count);
		
		ArrayList<Integer> pageNavi = pnavi.getPageNavi();
		
		model.addAttribute("pageNavi", pageNavi);
		model.addAttribute("pageNavigator", pnavi);
		
		return "todo/list"; //뷰이름  =>  /WEB-INF/views/ (뷰이름) .jsp
	}
	
	//등록화면
	@RequestMapping("/todo/insert_form")
	public String todo_insert_form() {
		
		return "todo/insert_form";
	}
	
	//등록작업
	@RequestMapping("/todo/insert_action")
	public String todo_insert_action(TodoVo vo) {
		
		String ns = "org.sesac.config.mappers.todo";
		session.insert(ns+".insert", vo);
		
		return "redirect:/todo/list";
	}
	
	//상세
	@RequestMapping("/todo/detail")
	public String todo_detail( 
			@RequestParam(value="target",required = false) String target, 
			@RequestParam(value="word", required = false) String word, 
			@RequestParam("no") int no, 
			Model model) throws TodoNotFoundException {
		
		String ns = "org.sesac.config.mappers.todo";
		TodoVo vo = session.selectOne(ns+".select", no);

		if( vo == null ) { //없는 할일 번호를 추출
			throw new TodoNotFoundException("없거나 삭제된 할일번호입니다 : "+no);
//			model.addAttribute("error_msg", "없거나 삭제된 할일번호입니다 : "+no);
//			return "todo/error";
		}
		
		model.addAttribute("vo", vo);
		
		return "todo/detail";
	}
	//수정하기
	@RequestMapping("/todo/update_form")
	public String todo_update_form( @RequestParam("no") int no, Model model) {
		
		String ns = "org.sesac.config.mappers.todo";
		TodoVo vo = session.selectOne(ns+".select", no);
		
		model.addAttribute("vo", vo);
		
		return "todo/update_form";
	}
	//수정작업
	@RequestMapping("/todo/update_action")
	public String todo_update_action(
			TodoVo vo,
			@RequestParam("pno") int pno) {
		
		String ns = "org.sesac.config.mappers.todo";
		session.update(ns+".update", vo);
		
		return "redirect:/todo/list?pno="+pno;
	}
	//삭제작업
	@RequestMapping("/todo/delete_action")
	public String todo_delete_action(
			@RequestParam("no") int no,
			@RequestParam("pno") int pno) {
		
		String ns = "org.sesac.config.mappers.todo";
		session.delete(ns+".delete", no);
		
		return "redirect:/todo/list?pno="+pno;
	}

	// 할일 검색
	@RequestMapping("/todo/search")
	public String todo_search(
			@RequestParam("target") String target,
			@RequestParam("word") String word,
			@RequestParam( value="pno",required = false, defaultValue = "1" ) int pno,
			Model model) {
		
		int rowPerPage = 3 ; //페이지당 보여줄 게시물 수
		int pagePerGrp = 4 ; //하단 보여줄 페이지번호 갯수 
		
		HashMap<String,Object> map = new HashMap<String, Object>();
		int startNo = (pno-1) * rowPerPage ;
		map.put("startNo", startNo);
		map.put("size", rowPerPage );
		map.put("target", target );
		map.put("word", "%"+word+"%" );
		
		String ns = "org.sesac.config.mappers.todo";
		List<TodoVo> list = session.selectList(ns+".search", map);
		model.addAttribute("todo_list", list);
		
		PageNavigator pnavi = new PageNavigator();//하단 페이지번호 목록 생성
		pnavi.setRowPerPage(rowPerPage);//페이지당 보여줄 게시물 수
		pnavi.setPagePerGrp(pagePerGrp);//하단 보여줄 페이지번호 갯수 
		pnavi.setCurrentPageNo(pno);
		
		// 총게시물 수 추출
		int todo_count = session.selectOne(ns+".search_count", map);
		model.addAttribute("todo_count", todo_count);
		
		pnavi.setTotalRow(todo_count);
		
		ArrayList<Integer> pageNavi = pnavi.getPageNavi();
		
		model.addAttribute("pageNavi", pageNavi);
		model.addAttribute("pageNavigator", pnavi);
		
		return "todo/search_list"; //뷰이름  =>  /WEB-INF/views/ (뷰이름) .jsp
	}
	
	@ExceptionHandler(Exception.class)
	public String todonotfoundexception(Exception e, HttpServletRequest req) {
		
		req.setAttribute("exception", e);
		return "todo/error";
	}
	
	@RequestMapping("todo/upload_form")
	public String todo_upload_form() { //파일업로드를 위한 폼화면
		
		return "todo/upload_form";
	}
	String UPLOAD_PATH="C:\\Users\\user\\Documents\\workspace-sts-3.9.12.RELEASE\\spring_04_todo\\src\\main\\webapp\\resources\\upload";
	
	@RequestMapping("todo/upload_action")
	public String todo_upload_action(
			@RequestParam("uploadFile") MultipartFile file,
			Model model) throws IllegalStateException, IOException { //파일업로드를 위한 폼화면
			
			String filename = file.getOriginalFilename();
			
			if( !filename.isEmpty() ) { //업로드한 파일이 있따면
				file.transferTo(new File(UPLOAD_PATH,filename));//저장하기
				model.addAttribute("msg","파일업로드 성공");
				model.addAttribute("filename",filename);
			}
			
		return "todo/upload_action";
	}
	
	
}


```

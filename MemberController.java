***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package org.sesac.member_06;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.sesac.member_06.vo.MemberVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

	@Autowired
	SqlSession session;
	String ns = "org.sesac.config.mappers.web_member";
	
	@RequestMapping("mem/insert_form")
	public String mem_insert_form() {
		
			return "mem/insert_form";
	}
	
	@RequestMapping("mem/insert_action")
	public String mem_insert_action(MemberVo vo, Model model) {
		// userid 중복 검사
		MemberVo findvo = session.selectOne(ns+".select", vo.getUserid());
		if( findvo != null ) { //사용중인 id
			String msg = "사용중인 ID입니다";
			model.addAttribute("msg", msg);
			return "mem/insert_action";
		}
		
		session.insert(ns+".insert", vo);
		model.addAttribute("msg", "회원 등록 성공");

		return "mem/insert_action";
	}
	
	@RequestMapping("mem/login_form")
	public String mem_login_form() {
		
			return "mem/login_form";
	}
	
	//로그인 
	@RequestMapping("mem/login_action")
	public String mem_login_action(
			MemberVo vo, 
			Model model,
			HttpSession httpss) {
		// userid 존재 검사
		MemberVo findvo = session.selectOne(ns+".select", vo.getUserid());
		if( findvo == null ) { //없는  id
			String msg = "없는 ID입니다";
			model.addAttribute("msg", msg);
			return "mem/login_form";
		}
		if( ! findvo.getUserpw().equals(vo.getUserpw())) { //없는  id
			String msg = "암호가 틀렸습니다";
			model.addAttribute("msg", msg);
			return "mem/login_form";
		}
		model.addAttribute("msg", "로그인 성공");
		model.addAttribute("member_vo", findvo);
		
		httpss.setAttribute("myinfo", findvo);//로그인했음을 표시하는 정보
		
		return "redirect:/"; //홈으로
	}
	
	@RequestMapping("mem/logout_action")
	public String mem_logout_action(
			Model model,
			HttpSession httpss) {
		
		httpss.removeAttribute("myinfo"); //로그인했음을 표시하는 정보 - 삭제
		model.addAttribute("msg", "로그아웃 했습니다");
		
		return "mem/logout_action"; //홈으로
	}
	
}


```

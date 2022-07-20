***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package org.sesac.spring_03_mybatis;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.sesac.vo.TodoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MybatisController {
	@Autowired
	private SqlSession session;
	
	@RequestMapping("/test_session")
	public String test_con() throws SQLException {
		
		String ns = "org.sesac.todo_mapper";
		List<TodoVo> list = session.selectList(ns+".selectAll");
		System.out.println("저장갯수: "+list.size());
		for (TodoVo vo : list) {
			System.out.println(vo);
		}//end for
		
		return "home";
	}
}


```

***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package org.sesac.spring_03_mybatis;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.sesac.vo.TodoVo;

public class TestMyBatis {

	public static void main(String[] args) throws Exception {
		String resource = "org/sesac/mybatis/mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

//		try (SqlSession session = sqlSessionFactory.openSession(true)) {
//			TodoVo vo = new TodoVo(1, "제목 1", "할일 1", "2022-01-05", "2022-01-06");  
//			String ns = "org.sesac.todo_mapper";
//			session.insert( ns+".insert", vo);
//			}
		
		try (SqlSession session = sqlSessionFactory.openSession(true)) {
			String ns = "org.sesac.todo_mapper";
			List<TodoVo> list = session.selectList(ns+".selectAll");
			System.out.println("저장갯수: "+list.size());
			for (TodoVo vo : list) {
				System.out.println(vo);
			}//end for
		}
	}

}


```

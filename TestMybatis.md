***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package day_12_15_mybatis;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class TestMybatis {

	public static void main(String[] args) throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
//		회원등록
//		try (SqlSession session = sqlSessionFactory.openSession(true)) { //auto commit 여부
//			MemberVo vo = new MemberVo(	20, "홍1","010-221" , "홍1유저", "서울1");
//			session.insert("member.insert", vo);
//			System.out.println("등록 성공");
//		}
		
//		회원 1명 검색
//		try (SqlSession session = sqlSessionFactory.openSession()) {
//			MemberVo vo = session.selectOne("member.selectOne", 3);
//			System.out.println(vo);
//		}
		
//		회원갯수 반환
//		try (SqlSession session = sqlSessionFactory.openSession()) {
//			int cnt = session.selectOne("member.count");
//			System.out.println(cnt);
//		}

//		회원삭제
//		try (SqlSession session = sqlSessionFactory.openSession(true)) {
//			session.delete("member.delete", 3);
//			System.out.println("삭제 성공");
//		}
	
//		회원 여러명 검색
//		try (SqlSession session = sqlSessionFactory.openSession()) {
//			List<MemberVo> memList = session.selectList("member.selectAll");
//			for (MemberVo memberVo : memList) {
//				System.out.println(memberVo);
//			}
//		}

//		회원 여러명 조건 검색(XX검색)
//		try (SqlSession session = sqlSessionFactory.openSession()) {
//			HashMap<String, String> m = new HashMap<String, String>();
//			m.put("col", "name");
//			m.put("col", "addr");
//			m.put("col", "intro");
//			m.put("col", "tel");
//			m.put("val", "%21%");
//			
//			List<MemberVo> memList = session.selectList("member.find",m);
//			for (MemberVo memberVo : memList) {
//				System.out.println(memberVo);
//			}
//		}
		
//		회원수정기능 테스트 코드
		try (SqlSession session = sqlSessionFactory.openSession(true)) { //auto commit 여부
		System.out.println("*** 수정전 ***");
		MemberVo vo = session.selectOne("member.selectOne", 2);
		System.out.println(vo);
		
		MemberVo vo2 = new MemberVo(2, "홍2","222-222" , "홍2유저", "서울2");
		session.update("member.update", vo2);
		System.out.println("수정 성공");
		
		System.out.println("*** 수정후 ***");
		vo = session.selectOne("member.selectOne", 2);
		System.out.println(vo);
	}		

	}//end main
}

```

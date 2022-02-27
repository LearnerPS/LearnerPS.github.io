***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import member.vo.MemberVo;

public class MemberDao {

	static SqlSessionFactory sqlSessionFactory = null;
	
	static { // 프로그램 실행시 main()실행전 딱 한번 실행
		try {
			String resource = "mybatis-config.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void insert(MemberVo vo) throws Exception {
		// auto commit(자동저장기능 비활성 기본. ~openSession(true) 자동저장 활성
		try (SqlSession session = sqlSessionFactory.openSession(true)) {
			session.insert("member.insert", vo);
		}
	}

	public List<MemberVo> selectAll() throws Exception {
		List<MemberVo> list = null;
		try (SqlSession session = sqlSessionFactory.openSession(true)) {
			list = session.selectList("member.selectAll");
		}
		return list;
	}

	public int count() throws Exception {
		int count = 0;
		try (SqlSession session = sqlSessionFactory.openSession(true)) {
			count = session.selectOne("member.count");
		}
		return count;
	}
}

```

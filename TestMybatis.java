***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import member.vo.MemberVo;

public class TestMybatis {

	public static void main(String[] args) throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		// auto commit(자동저장기능 비활성 기본. ~openSession(true) 자동저장 활성
		try (SqlSession session = sqlSessionFactory.openSession(true)) {
			MemberVo vo = new MemberVo(30, "홍30", "010-300", "30번ㅎ유저", "서울 30");
			session.insert("member.insert", vo);
			System.out.println("저장성공");
		}
  }//end main
}

```

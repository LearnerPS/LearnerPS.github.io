***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package day_12_14;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestSelectJdbc {

	public static void main(String[] args) {

		//MySQL jdbc driver 로딩
		//MySQL 연결
		Connection conn = null;
		PreparedStatement stmt = null;
		String sql="SELECT count(*) FROM MEMBER";
		try {
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {//서버 데이터 포인트를 아래로 내린다.
				int cnt = rs.getInt(1);
				System.out.println("행 갯수는 "+cnt);
			}
		} catch (ClassNotFoundException e) {
			System.out.println("** Jdbc Driver 파일을 등록하세요! **");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("** SQL 처리 문제 발생! **");
			e.printStackTrace();
		} finally {
			JdbcUtil.close(stmt, conn);
		}
		
	}//end main

}//end class

```

***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package day_12_13;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class TestUpdateJdbc {

	public static void main(String[] args) {
		// 5번 유저의 주소를 인천으로 변경하는 코드
		Connection conn = null;
		PreparedStatement stmt = null;
		int no = 5;
		String addr = "인천";
		String insertSql = "UPDATE member set addr = ? ";
		insertSql +="where no = ? ";
		try {
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(insertSql);
			stmt.setString(1, addr);
			stmt.setInt(2, no);
//			stmt.executeQuery(); // SELECT 문장 처리
//			stmt.executeUpdate(); // DML(Insert, Update, Delete) 문장 처리
			stmt.executeUpdate(); 
			System.out.println("수정성공!!");
		} catch (Exception e) {
			System.out.println("SQL 처리 오류");
			e.printStackTrace();
		} finally {
			JdbcUtil.close(stmt, conn);
		}

  }//end main

}//end class

```

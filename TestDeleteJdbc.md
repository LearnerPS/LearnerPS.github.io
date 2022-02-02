***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package day_12_13;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class TestDeleteJdbc {

	public static void main(String[] args) {
		// 5번 유저 삭제하는 코드
		Connection conn = null;
		PreparedStatement stmt = null;
		int no = 5;
		String insertSql = "DELETE member ";
		insertSql +="where no = ? ";
		try {
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(insertSql);
			stmt.setInt(1, no);
//			stmt.executeQuery(); // SELECT 문장 처리
//			stmt.executeUpdate(); // DML(Insert, Update, Delete) 문장 처리
			stmt.executeUpdate(); 
			System.out.println("삭제성공!!");
		} catch (Exception e) {
			System.out.println("SQL 처리 오류");
			e.printStackTrace();
		} finally {
			JdbcUtil.close(stmt, conn);
		}
	
  }//end main

}//end class

```

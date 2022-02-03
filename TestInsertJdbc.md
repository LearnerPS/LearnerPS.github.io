***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package day_12_13;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class TestInsertJdbc {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement stmt = null;
		String username = "최길동";
		String tel = "010-114";
		String intro = "김씨'네번째";
		String addr = "부산";
		String insertSql = "insert into member(no,name,tel,intro,addr) ";
		insertSql +="values( ?, ?, ?, ?, ?)";
		try {
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(insertSql);
			stmt.setInt(1, 6);
			stmt.setString(2, username);
			stmt.setString(3, tel);
			stmt.setString(4, intro);
			stmt.setString(5, addr);
//			stmt.executeQuery(); // SELECT 문장 처리
//			stmt.executeUpdate(); // DML(Insert, Update, Delete) 문장 처리
			stmt.executeUpdate(); 
			System.out.println("등록성공!!");
		} catch (Exception e) {
			System.out.println("SQL 처리 오류");
			e.printStackTrace();
		} finally {
			JdbcUtil.close(stmt, conn);
		}
		
	}//end main
	
}//end class

```

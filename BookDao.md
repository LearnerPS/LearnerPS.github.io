***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package day_12_15;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BookDao {
	public int count() throws Exception {
		int cnt = 0;
		Connection conn = null;
		PreparedStatement stmt = null;
		String sql="SELECT count(*) FROM BOOK";
		try {
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			rs.next(); //서버 데이터 포인트를 아래로 내린다.
			cnt = rs.getInt(1);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		} finally {
			JdbcUtil.close(stmt, conn);
		}
		return cnt;
	}

	public void insert(BookVo vo) throws Exception {
		Connection conn = null;
		PreparedStatement stmt = null;
		String insertSql = "insert into book(isbn,title,publisher,author,price) ";
		insertSql +="values( ?, ?, ?, ?, ?)";
		try {
			conn = JdbcUtil.getConnection(); //연결오류
			stmt = conn.prepareStatement(insertSql);
			stmt.setString(1, vo.getIsbn());
			stmt.setString(2, vo.getTitle());
			stmt.setString(3, vo.getPublisher());
			stmt.setString(4, vo.getAuthor());
			stmt.setInt(5, vo.getPrice());
			stmt.executeUpdate(); //실행오류
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		} finally {
			JdbcUtil.close(stmt, conn);
		}
	}

	public ArrayList<BookVo> selectAll() throws Exception {
		ArrayList<BookVo> bookArr = new ArrayList<BookVo>();
		Connection conn = null;
		PreparedStatement stmt = null;
		String sql="SELECT * FROM BOOK ORDER BY isbn ASC";
		try {
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {//서버 데이터 포인트를 아래로 내린다.
				String isbn = rs.getString("isbn");
				String publisher = rs.getString("publisher");
				String author = rs.getString("author");
				int price = rs.getInt("price");
				BookVo vo = new BookVo();
				vo.setIsbn(isbn);
				vo.setPublisher(publisher);
				vo.setAuthor(author);
				vo.setPrice(price);
				bookArr.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		} finally {
			JdbcUtil.close(stmt, conn);
		}
		return bookArr;
	}

	public BookVo findByNo(String isbn) throws Exception {
		BookVo vo = null;
		Connection conn = null;
		PreparedStatement stmt = null;

		String sql="SELECT * FROM BOOK WHERE isbn = ?";
		try {
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, isbn);
			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {//서버 데이터 포인트를 아래로 내린다.
				vo = new BookVo();
				vo.setIsbn(isbn);
				vo.setPublisher(rs.getString("publisher"));
				vo.setAuthor(rs.getString("author"));
				vo.setTitle(rs.getString("title"));
				vo.setPrice(rs.getInt("price"));
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		} finally {
			JdbcUtil.close(stmt, conn);
		}		return null;
	}
}

```

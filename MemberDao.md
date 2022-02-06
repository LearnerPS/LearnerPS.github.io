***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package day_12_14;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDao {
	/** 회원정보를 등록 */
	public void insert(MemberVo vo) throws Exception {  
		Connection conn = null;
		PreparedStatement stmt = null;
		String insertSql = "insert into member(no,name,tel,intro,addr) ";
		insertSql +="values( ?, ?, ?, ?, ?)";
		try {
			conn = JdbcUtil.getConnection(); //연결오류
			stmt = conn.prepareStatement(insertSql);
			stmt.setInt(1, vo.getNo());
			stmt.setString(2, vo.getName());
			stmt.setString(3, vo.getTel());
			stmt.setString(4, vo.getIntro());
			stmt.setString(5, vo.getAddr());
			stmt.executeUpdate(); //실행오류
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		} finally {
			JdbcUtil.close(stmt, conn);
		}
	}//end insert
	/** 모든 회원정보를 검색 */
	public ArrayList<MemberVo> selectAll() throws Exception {
		ArrayList<MemberVo> memberArr = new ArrayList<MemberVo>();
		Connection conn = null;
		PreparedStatement stmt = null;
		String sql="SELECT * FROM MEMBER ORDER BY no ASC";
		try {
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {//서버 데이터 포인트를 아래로 내린다.
				int no2 = rs.getInt(1);
				String name = rs.getString(2);
				String tel = rs.getString(3);
				String intro = rs.getString(4);
				String addr = rs.getString(5);
				MemberVo vo = new MemberVo();
				vo.setNo(no2);
				vo.setName(name);
				vo.setTel(tel);
				vo.setIntro(intro);
				vo.setAddr(addr);
				memberArr.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		} finally {
			JdbcUtil.close(stmt, conn);
		}
		return memberArr;
	}
	/** 회원번호로 회원 검색 
	 * @throws Exception */
	public MemberVo findByNo(int no) throws Exception {
		
		MemberVo vo = null;
		Connection conn = null;
		PreparedStatement stmt = null;

		String sql="SELECT * FROM MEMBER WHERE no = ?";
		try {
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, no);
			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {//서버 데이터 포인트를 아래로 내린다.
				vo = new MemberVo();
				int no2 = rs.getInt(1);
				String name = rs.getString(2);
				String tel = rs.getString(3);
				String intro = rs.getString(4);
				String addr = rs.getString(5);
				vo.setNo(no2);
				vo.setName(name);
				vo.setTel(tel);
				vo.setIntro(intro);
				vo.setAddr(addr);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		} finally {
			JdbcUtil.close(stmt, conn);
		}
		
		return vo;
	}
	/** 회원번호로 회원 삭제 */
	public void delete(int no) throws Exception {
		Connection conn = null;
		PreparedStatement stmt = null;
		String insertSql = "DELETE from member ";
		insertSql +="where no = ? ";
		try {
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(insertSql);
			stmt.setInt(1, no);
			stmt.executeUpdate(); 
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		} finally {
			JdbcUtil.close(stmt, conn);
		}
	}//end delete
	public int count() throws Exception {
		int cnt = 0;
		Connection conn = null;
		PreparedStatement stmt = null;
		String sql="SELECT count(*) FROM MEMBER";
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
	
	/**
	 * 칼럼별 검색 <br>
	 * 123456 */
	public ArrayList<MemberVo> findBy(String colName, String value) throws Exception {
		ArrayList<MemberVo> memberArr = new ArrayList<MemberVo>();
		Connection conn = null;
		PreparedStatement stmt = null;
		String sql="SELECT * FROM MEMBER WHERE ";
		sql += colName +" LIKE ? ";
		try {
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, value);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {//서버 데이터 포인트를 아래로 내린다.
				int no2 = rs.getInt(1);
				String name = rs.getString(2);
				String tel = rs.getString(3);
				String intro = rs.getString(4);
				String addr = rs.getString(5);
				MemberVo vo = new MemberVo();
				vo.setNo(no2);
				vo.setName(name);
				vo.setTel(tel);
				vo.setIntro(intro);
				vo.setAddr(addr);
				memberArr.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		} finally {
			JdbcUtil.close(stmt, conn);
		}
		return memberArr;
	}
	public void update(MemberVo vo) throws Exception {
		Connection conn = null;
		PreparedStatement stmt = null;
		int no = 5;
		String insertSql = "UPDATE member set  ";
		insertSql += " name = ?, 	";
		insertSql += " intro = ?, 	";
		insertSql += " tel = ?, 	";
		insertSql += " addr = ? 	";
		insertSql +="where no = ? 	";
		System.out.println( "SQL: "+insertSql );
		try {
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(insertSql);
			stmt.setString(1, vo.getName());
			stmt.setString(2, vo.getIntro());
			stmt.setString(3, vo.getTel());
			stmt.setString(4, vo.getAddr());
			stmt.setInt(5, vo.getNo());
			stmt.executeUpdate(); 
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		} finally {
			JdbcUtil.close(stmt, conn);
		}
	}
}

```

package day_12_14;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestSelectWhereVoJdbc {

	public static void main(String[] args) {

		// 회원번호가 5인 회원의 모든 정보를 추출
		MemberVo vo = null;
		Connection conn = null;
		PreparedStatement stmt = null;
		int no = 5;
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
		} catch (ClassNotFoundException e) {
			System.out.println("** Jdbc Driver 파일을 등록하세요! **");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("** SQL 처리 문제 발생! **");
			e.printStackTrace();
		} finally {
			JdbcUtil.close(stmt, conn);
		}
		
		if(vo==null) {
			System.out.println("없거나 삭제된 회원입니다");
		}else {
			System.out.println("검색결과---");
			System.out.println(vo);
		}
		
	}//end main
	
}//end class

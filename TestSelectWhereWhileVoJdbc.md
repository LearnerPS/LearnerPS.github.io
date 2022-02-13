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

public class TestSelectWhereWhileVoJdbc {

	public static void main(String[] args) {

		// 회원이름에 길동이 포함된 회원 목록 추출
		ArrayList<MemberVo> memberArr = new ArrayList<MemberVo>();
		Connection conn = null;
		PreparedStatement stmt = null;
		String findname = "%%";
		String sql="SELECT * FROM MEMBER WHERE name LIKE ? ORDER BY no DESC  ";
		try {
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, findname);
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
		} catch (ClassNotFoundException e) {
			System.out.println("** Jdbc Driver 파일을 등록하세요! **");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("** SQL 처리 문제 발생! **");
			e.printStackTrace();
		} finally {
			JdbcUtil.close(stmt, conn);
		}
		
		if(memberArr.size() == 0) {
			System.out.println("** 검색결과가 없읍니다 **");
		}else {
			System.out.println("** 검색결과: "+memberArr.size()+"건 **");
			for (MemberVo vo : memberArr) {
				System.out.println(vo);
			}//end for
		}
	}//end main
}//end class

```

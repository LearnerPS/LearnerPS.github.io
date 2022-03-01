***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

import java.util.List;

import member.vo.MemberVo;

public class TestMemberDao {

	public static void main(String[] args) {
//		test_insert();
//		test_printAll();
		test_count();
	}

	private static void test_count() {
		//등록된 회원수를 추출, 출력하는 코드를 작성하세요
		try {
			MemberDao dao = new MemberDao();
			int cnt = dao.count();
			System.out.println("등록회원수: "+cnt);
		} catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
	}

	private static void test_printAll() {
		try {
			MemberDao dao = new MemberDao();
			List<MemberVo> list = dao.selectAll();
			System.out.println("** 전체 출력 **");
			for (MemberVo memberVo : list) {
				System.out.println(memberVo);
			}
		} catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
	}

	private static void test_insert() {
		MemberVo vo = new MemberVo(31, "홍31", "010-301", "31번ㅎ유저", "서울 31");
		try {
			MemberDao dao = new MemberDao();
			dao.insert( vo );
			System.out.println("등록 성공");
		} catch (Exception e) {
			System.out.println("등록 실패: "+e.getMessage());
			e.printStackTrace();
		}
	}
}

```

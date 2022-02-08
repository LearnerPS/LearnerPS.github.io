***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package day_12_14;

import java.util.ArrayList;

public class TestMemberDao {

	public static void main(String[] args) {
//		test_insert();
//		test_selectAll();
//		test_findByNo();
//		test_delete();
		test_count();
//		test_find();
//		test_update();
//		test_selectAll();
	}
	private static void test_update() {
		try {
			MemberDao memDao = new MemberDao();
			//바꾸고 싶은 정보 검색
			MemberVo vo = memDao.findByNo(5);
			if(vo==null) {
				return;
			}
			//현재 정보 출력
			System.out.println("현재:"+vo);
			//전화번호 수정, 소개 수정
			vo.setTel("010-332");
			vo.setIntro("수정된 정보");
			memDao.update( vo );
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void test_find() {
		//이름,주소,전화 로 검색
		MemberDao memDao = new MemberDao();
//		memDao.findByName("길동");
//		memDao.findByAddr("서울");
//		memDao.findByTel("111");
//		memDao.findByIntro("유저");
		try {
			ArrayList<MemberVo> memList = memDao.findBy("no", "5"); // EJB 기술 기준
			System.out.println("** 검색 결과 **");
			for (MemberVo vo : memList) {
				System.out.println(vo);
			}//end for
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void test_count() {
		//현재 등록된 회원수를 출력
		try {
			MemberDao memDao = new MemberDao();
			int count = memDao.count(); // TestSelectJdbc.java 활용
			System.out.println("등록된 회원수: "+count);
		} catch (Exception e) {
			System.out.println("오류발생: "+e.getMessage());
			e.printStackTrace();
		}
		
	}
	private static void test_delete() {
		// 5번 회원을 삭제하는 코드를 작성하세요
		// MemberDao.delete(...)의 코드만 슬랙 DM으로 보내주세요. 그리고 쉬세요~
		try {
			MemberDao memDao = new MemberDao();
			memDao.delete( 5 );
			System.out.println("삭제 성공");
		} catch (Exception e) {
			System.out.println("삭제시 오류발생");
			e.printStackTrace();
		}
	}
	
	private static void test_findByNo() {
		try {
			MemberDao memDao = new MemberDao();
			MemberVo vo = memDao.findByNo( 50 ); //PK로 검색
			if( vo == null ) {
				System.out.println("없거나 삭제된 정보입니다");
			}else {
				System.out.println("검색된 정보: "+vo.toString());
			}
		} catch (Exception e) {
			System.out.println("검색시 오류발생");
		}
	}
	/** 테이블 전체정보 출력 */
	private static void test_selectAll() {
		MemberDao memDao = new MemberDao();
		try {
			ArrayList<MemberVo> memList = memDao.selectAll();
			System.out.println("** 전체 출력 **");
			for (MemberVo vo : memList) {
				System.out.println(vo);
			}
		} catch (Exception e) {
			System.out.println("전체출력 오류:" + e.getMessage());
		}
	}
	/** 테이블에 정보 추가 */
	private static void test_insert() {
		try {
			MemberVo vo = new MemberVo(12,"홍길동2","010-211","새로운 홍길동~","서울 강남");
			MemberDao memDao = new MemberDao();
			memDao.insert( vo );
			System.out.println("등록 성공");
		} catch (Exception e) {
			System.out.println("등록 실패");
		}
	}
}

```

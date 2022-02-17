***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package day_12_15;

import java.util.ArrayList;

public class TestBookDao {
	public static void main(String[] args) {
//		test_insert();
//		test_count();
//		test_selectAll();
		test_findByIsbn();
	}

	private static void test_findByIsbn() {
		try {
			BookDao dao = new BookDao();
			BookVo vo = dao.findByNo( "100" ); //PK로 검색
			if( vo == null ) {
				System.out.println("없거나 삭제된 정보입니다");
			}else {
				System.out.println("검색된 정보: "+vo.toString());
			}
		} catch (Exception e) {
			System.out.println("검색시 오류발생");
		}

	}

	private static void test_selectAll() {
		try {
			BookDao dao = new BookDao();
			ArrayList<BookVo> list = dao.selectAll();
			System.out.println("** 전체출력 **");
			for (BookVo vo : list) {
				System.out.println(vo);
			}
		} catch (Exception e) {
			System.out.println("SQL 예외발생:"+e.getMessage());
			e.printStackTrace();
		}
	}

	private static void test_count() {
		try {
			BookDao dao = new BookDao();
			int count = dao.count();
			System.out.println("등록도서수: "+count);
		} catch (Exception e) {
			System.out.println("SQL 예외발생:"+e.getMessage());
			e.printStackTrace();
		}
	}

	private static void test_insert() {
		try {
			BookDao dao = new BookDao();
			BookVo vo = new BookVo("100","자바기본","한빛","김저자",30000);
			dao.insert(vo);
			vo = new BookVo("200","파이썬기본","한빛","김저자",25000);
			dao.insert(vo);
			vo = new BookVo("300","웹기본","한빛","박저자",35000);
			dao.insert(vo);
			System.out.println("도서등록성공");
		} catch (Exception e) {
			System.out.println("SQL 예외발생:"+e.getMessage());
			e.printStackTrace();
		}
	}
}

/*
*** Book 테이블에 연습하기 ***
구현기능 
등록
갯수 반환
전체출력
하나만 출력
삭제

작성순서
- 프로젝트 만들기  day_12_15
- 테스트 클래스 작성  TestBookDao
- JdbcUtil.java 복붙
- BookDao클래스(껍데기만 작성)
- BookVo 작성 변수,생성자2개,getter,setter,toString
- main()에서 test_insert() 호출, test_insert()작성
  test_insert() BookVo 객체 만들어   BookDao.insert(...) 호출하여 
  테이블에 등록하기  ( 3가지 정보를 등록하기 )

- main()에서 test_insert() 호출 삭제
- main()에서 test_count() 호출, test_count()작성
  test_count() BookDao.count() 호출하여 저장된 Book 갯수(int) 반환받아 출력하기

- main()에서 test_count() 호출 삭제
- main()에서 test_selectAll() 호출, test_selectAll()작성
  test_selectAll()  Book.selectAll() 호출하여 저장된 모든 Book정보를 저장한 
  ArrayList<BookVo>를 반환받아 출력하기

- main()에서 test_count() 호출 삭제
- main()에서 test_findByIsbn() 호출, test_findByIsbn() 작성
  test_findByIsbn()  Book.findByIsbn(String isbn) 호출하여 
  isbn에 해당하는 Book정보를 저장한 BookVo를 반환받아 출력하기

- main()에서 test_findByIsbn() 호출 삭제
- main()에서 test_delete() 호출, test_delete() 작성
  test_delete()  Book.delete(String isbn) 호출하여 
  isbn에 해당하는 Book정보를 삭제한다
  */

```

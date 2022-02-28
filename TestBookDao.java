***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

import java.util.List;

import book.vo.BookVo;


public class TestBookDao {

	public static void main(String[] args) {
		test_insert();
		test_printAll();
		test_count();
	}
	private static void test_count() {
		//등록된 회원수를 추출, 출력하는 코드를 작성하세요
		try {
			BookDao dao = new BookDao();
			int cnt = dao.count();
			System.out.println("등록도서수: "+cnt);
		} catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
	}

	private static void test_printAll() {
		try {
			BookDao dao = new BookDao();
			List<BookVo> list = dao.selectAll();
			System.out.println("** 전체 출력 **");
			for (BookVo bookVo : list) {
				System.out.println(bookVo);
			}
		} catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
	}

	private static void test_insert() {
		BookVo vo = new BookVo("2000","빅데이터분석","공능","박저자",35000);
		try {
			BookDao dao = new BookDao();
			dao.insert( vo );
			System.out.println("등록 성공");
		} catch (Exception e) {
			System.out.println("등록 실패: "+e.getMessage());
			e.printStackTrace();
		}
	}
}

```

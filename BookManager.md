***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package day_12_08;
/** BookVo의 CRUD 메서드 제공 */

import java.util.ArrayList;

public class BookManager {

	private ArrayList<BookVo> list = new ArrayList<BookVo>();
	
	public ArrayList<BookVo> getList() {
		return list;
	}
	
	public void add(BookVo vo) {
		list.add(vo);
	}

	public boolean isExist(String isbn) {
		for (BookVo vo : list) {
			if(vo.getIsbn().equals(isbn)) 
				return true;//같은 isbn찾으면 true반환, 종료
		}
		return false;
	}

	public BookVo findByIsbn(String isbn) {
		for (BookVo vo : list) {
			if(vo.getIsbn().equals(isbn)) 
				return vo;//같은 isbn찾으면 vo반환, 종료
		}
		return null;//못찾으면 반환
	}

	public BookVo findByTitle(String title) {
		for (BookVo vo : list) {
			if(vo.getTitle().equals(title)) 
				return vo;//같은 title찾으면 vo반환, 종료
		}
		return null;
	}

	public boolean remove(String isbn) {
		for (BookVo vo : list) {
			if(vo.getIsbn().equals(isbn)) {
				list.remove(vo);
				return true;
			}
		}
		return false;
	}// remove
	
}

```

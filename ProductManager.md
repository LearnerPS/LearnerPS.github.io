
***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
//이번에는 연습할 때와 다른 방식으로 클래스를 만들었다

//강사님의 말씀대로라면 실전에서는 보통 데이터의 안전한 관리를 위해

//매니저 클래스를 작성해서 배열과 카운트 변수를 보호하기도 한다고 한다
***
```ruby

/** Product 배열과 count 변수를 보호하기 */
public class ProductManager {
	
	private Product[] parr = new Product[100];
	private int count = 0;
	
	public void add(Product p) {
		parr[count++] = p;
	}
	
	public int getCount() {
		return count;
	}
	
	/** 이름으로 검색, 해당 이름의 번호를 반환 */
	public int findByName(String name) {
		for(int i=0; i<count; i++) {
			if(parr[i].getName() == name) {
				return i; //해당 위치를 반환, 종료
			}
		}
		return -1; //이름을 못찾으면 -1 반환
	
	}//end findByName 
	
}//end class

```
***
//이전과 다른 방식으로 클래스를 작성하니 뭔가 새로웠다

//익숙해지도록 노력해야지! =)
***

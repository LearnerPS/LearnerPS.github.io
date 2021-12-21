
***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
//이번엔 데이터저장에 관련된 변수와 함수를 따로 묶어 관리한다

//p라는 변수를 선언하여 그 안에 냉장고, 세탁기 등의 값을 넣고

//처음에 만들어둔 pm 안에 모든 p를 add한다
***
```ruby

public class TestProduct2 {

	public static void main(String[] args) {
		//데이터저장에 관련된 변수와 함수를 따로 클래스로 묶음 -> XXXManager
		ProductManager pm = new ProductManager(); //배열과 count를 포함하고 있음
		
		Product p = new Product("냉장고", "삼성", 100);
		pm.add(p); //parr[count++] = p; 를 의미함
		p = new Product("세탁기", "LG", 110);
		pm.add(p); //parr[count++] = p; 를 의미함
		p = new Product("김치냉장고", "만도", 120);
		pm.add(p); //parr[count++] = p; 를 의미함
		
		System.out.println("** 저장갯수: "+pm.getCount());
		
		// "세탁기"를 찾아서 가격을 130으로 수정
		String findName = "세탁기2";
		int findIndex = pm.findByName(findName);
		if(findIndex == -1) {
			System.out.println(findName+"검색 실패");
		}else {
			System.out.println(findName+"검색 성공");
		}
		
	}//end main

}//end class

```
***
//이번에는 이전보다 더 짧게 코드를 작성했다

//강사님 말씀으로는 같은 기능이라도 더 짧게, 간결하게 작성해서

//시간을 절약함과 동시에 관리가 용이하도록 하는 것이 고수라고 한다

//언젠간 그런 실력자가 되어 최적의 길이로 개발할 수 있게 꾸준히 노력해야겠다!
***

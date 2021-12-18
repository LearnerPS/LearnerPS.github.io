
***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package day04;

public class TestMyProduct {

	public static void main(String[] args) {
		// 상품정보를 저장할 배열객체를 만드세요. 길이는 100개
		MyProduct[] pa = new MyProduct[100];
		int count = 0; //저장갯수 관리용
		
		pa[count++] = new MyProduct("냉장고", "삼성", 100);
		pa[count++] = new MyProduct("세탁기", "LG", 110);
		pa[count++] = new MyProduct("김치냉장고", "만도", 120);
		
	}//end main

}//end class

```

***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
//이번엔 물품 관련 클래스다

//블루투스 스피커와 pc 스피커의 가격을 표기해준다
***

```ruby

package day03;

public class TestProduct {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.name = "블루투스 스피커";
		p1.no = 12341234;
		p1.price1 = 89000;

		System.out.println(p1.name + "의 가격은 "+p1.price1+ "원 입니다.");

		Product p2 = new Product();
		p2.name = "PC 스피커";
		p2.no = 23452345;
		p2.price1 = 50000;
		
		System.out.println(p2.name + "의 가격은 "+p2.price1+ "원 입니다.");
		
	}

}


```

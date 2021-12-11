***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package day03;

public class TestBook {

	public static void main(String[] args) {
		
		Book b1 = new Book("혼자공부하는자바", 24000, "신용권", "한빛미디어");
		b1.setName("혼자공부하는자바");
		b1.setPrice(24000);
		b1.printInfo();
				
		Book b2 = new Book("이것이MySQL이다", 32000, "우재남", "한빛미디어");
		b2.setName("이것이MySQL이다");
		b2.setPrice(32000);
		b2.printInfo();
				
		System.out.println(b1.getName()+"의 가격은 "+ b1.getPrice()+"원 입니다.");
		System.out.println(b2.getName()+"의 가격은 "+ b2.getPrice()+"원 입니다.");
		
	}

}

```

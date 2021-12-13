
***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package day03;

public class TestStudent {

	public static void main(String[] args) {

		Student s1 = new Student("홍길동 ", 1122);
		s1.setName("강길동 ");
		s1.setNumber(1112);
		s1.printInfo();
		
		Student s2 = new Student("김길동 ", 2233);
		s2.printInfo();
		
		System.out.println(s1.getName()+"의 학번은 "+s1.getNumber());
	}

}

```

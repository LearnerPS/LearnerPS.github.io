
***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package day04;

public class TestMovie {

	public static void main(String[] args) {
		
		Movie m1 = new Movie("지옥","연상호",300);
		Movie m2 = new Movie("오징어게임","황동혁",200);
		m1.printInfo();
		m2.printInfo();
		
		System.out.println( "제목:"+m1.getTitle()+", 감독:"+m1.getDirector() );
	}
}

```

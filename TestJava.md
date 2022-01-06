***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package day_12_02;

public class TestJava {

	public static void main(String[] args) {
		Member m1 = new Member("김길동",30);
		m1.setData( "김길동", 30 );
//		m1.setData( 30, "김길동" );
		
		A a1 = new A();
		A a2 = new A();
		a1.i = 5;
		A.title = "(주) A";
		System.out.println( a2.i );
		System.out.println( a2.title );
		
	}//end main
  
}//end class

class A{
	int i;//객체마다 따로 생성
	static String title=null;
	
	static void prn1() {
		System.err.println( title );

  }
  
}

```

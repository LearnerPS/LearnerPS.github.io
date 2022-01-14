***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package day_12_03;

import java.util.Objects;

public class TestObject {

	public static void main(String[] args) {
		A a1 = new A();
		Object o1 = a1;
		/////////////
		
		String s1 = "abc";
		String s2 = "abc";
		
		String s3 = new String("abc");
		String s4 = new String("abc");
		
		// == 비교연산자는 참조값 비교
		System.out.println( s1 == s2 ); // true
		System.out.println( s1 == s3 ); // false
		System.out.println( s3 == s4 ); // false
		///
		System.out.println( "s1 s3내용비교: "+ s1.equals(s3) );
		System.out.println( "s3 s4내용비교: "+ s3.equals(s4) );
		
		A a2 = new A();
		a2.i = 3;
		A a3 = new A();
		a3.i = 3;
		System.out.println( a2 == a3 ); // false
		System.out.println( a2.equals(a3) ); // false
		
	}
  
}

class A extends Object{
	int i;

	// Source -> Generate hashCode and equals
	@Override
	public int hashCode() {
		return Objects.hash(i);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		A other = (A) obj;
		return i == other.i;
	}
	
}

class B{
	
}

```

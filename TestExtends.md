***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package day_12_01;

public class TestExtends {

	public static void main(String[] args) {
		B b1 = new B();
		b1.name = "홍길동";
		b1.age = 30;

		C c1 = new C();
		c1.name = "김길동";
		c1.tel = "111-222";
		
		System.out.println("B.getInfo() = "+b1.getInfo());
		
		A a1 = b1; // 부모타입 변수 = 자식객체. Up-Casting
		a1.name = "박길동";
		System.out.println( "a1.getInfo() "+a1.getInfo() );
		//호출하는 메서드를 실제 객체가 재정의하고 있으면 재정의된 메서드가 호출됨
		
		A a2 = c1;
		System.out.println("a2.getInfo() "+a2.getInfo());
		
		//나이 변경시 B타입 확인하고 형변환 후 age 수정
		System.out.println(  a1 instanceof B  ); // true ?
		System.out.println(  a1 instanceof C  ); // false ?
		if( a1 instanceof B ) {
			System.out.println( "a1은 B타입" );
			B b2 = (B)a1; // Down-Casting
			b2.age = 35;
		}
		if( a1 instanceof C ) {
			System.out.println( "a1은 C타입" );
			C c2 = (C)a1; // Down-Casting
			c2.tel="222-333";
		}
		//메서드 재정의
		
		A[] arr = new A[3];
		arr[0] = b1;
		arr[1] = c1;
		arr[2] = new B();
		for(int i=0; i<arr.length; i++) {
			System.out.println("i="+i+" "+arr[i].getInfo());
		}
		
	}//end main
}//end class

class A{
	String name;
	public String getInfo() {//모든 변수정보 출력
		return "name="+name;
	}
}
class B extends A{
	int age;//나이
	public String getInfo() {//모든 변수정보 출력
		return super.getInfo()+","+age;
	}
}
class C extends A{
	String tel;//전화
	public String getInfo() {//모든 변수정보 출력
		return super.getInfo()+","+tel;
	}
}

```

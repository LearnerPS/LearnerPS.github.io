***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
//이번엔 Exception을 연습했다

//첫번째 코드는 try, catch.

//두번째 코드는 throws로 ClassNotFoundException을 처리했다
***
```ruby

package day_12_03;

public class TestException {

	public static void main(String[] args) {
		try {
			classLoading();
			System.out.println("로딩작업 성공");
			classExecute();
			System.out.println("프로그램 종료");
		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
			System.out.println("오류발생");
		}
	}//end main
```
***
```ruby

	private static void classExecute() {
	}

	private static void classLoading() throws ClassNotFoundException{
		
		System.out.println("클래스 로딩전");
//		Class.forName("java.lang.String"); //정상적인 클래스명
		Class.forName("String"); //잘못된 클래스명
		System.out.println("클래스 로딩성공");
	}
}//end class

```

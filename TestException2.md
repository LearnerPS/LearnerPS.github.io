***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package day_12_02;

public class TestException2 {

	public static void main(String[] args) {
		try {
			a();
			System.out.println("작업 성공");
		}catch (Exception e) {
			System.out.println("작업 실패");
		}
	}

	private static void a() throws ClassNotFoundException {
		// Member 클래스를 읽어들이는 코드
		//Class.forName("Member"); // 예외발생
		Class.forName("day_12_02.Member"); //예외발생 안함. 정상실행
		System.out.println("클래스 로딩 성공");
		System.out.println("클래스 로딩 끝");
	}//end a
}

```

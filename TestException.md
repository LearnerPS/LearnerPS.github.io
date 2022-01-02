***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package day_12_02;

public class TestException {

	public static void main(String[] args) {
		try {
			//실행하려는 코드
			String s = "ㅁㅍㅊ";
			System.out.println( s.length()  ); // 문자열 길이
			System.out.println("정상실행");
			
			int[] arr = new int[100];
			arr[0] = 10;
			arr[1] = 20;
			arr[10] = 1000;
			System.out.println("배열실행");
		}catch(Exception e) {
			//오류발생시 실행할 코드
			System.out.println( "기타 예외발생" ); 
		}
		//실행 완료 코드
		System.out.println("실행종료");
	}
}

```

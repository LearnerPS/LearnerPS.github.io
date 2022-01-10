***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package day_12_03;

public class TestException2 {

	public static void main(String[] args) {
		
		try {
			String s = "abc";
			System.out.println( s.length() ); // NullPointerException 발생
			int[] arr = new int[100];
			arr[100] = 100; //ArrayIndexOutOfBoundsException 발생
			System.out.println("종료");
		} catch (NullPointerException e) {
			System.out.println("변수에 null 있음");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 길이를 넘어선 접근");
		} catch (Exception e) {
			System.out.println("예외발생");
		}
		
	}//end main

}// end class

```

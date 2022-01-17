***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package day_12_06;

import java.util.ArrayList;

public class TestList {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("김길동");
		arr.add("박길동");
		arr.add("이길동");
		System.out.println( "저장개수="+arr.size() );
		System.out.println( "0번째 = "+arr.get(0) );
		// 배열 사용코드
		String[] starr = new String[100];
		int count = 0;
		starr[count++] = "홍길동";
		starr[count++] = "김길동";
		starr[count++] = "이길동";
		System.out.println( "저장개수=" + count );
		System.out.println( "0번째 = " + starr[0] );
		//
		arr.remove(1);//김길동 삭제
		System.out.println( arr );
		arr.remove("이길동");//내부적으로 equals()가 참인 객체 삭제
		System.out.println( arr );
		
		
	}//end main

}//end class

```

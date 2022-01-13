***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package day_12_03;

import java.util.ArrayList;
import java.util.Scanner;

public class TestList3 {
	public static void main(String[] args) {
		// 2. 1번을 무한 반복한다. -999입력시 저장 안함. 반복종료
		ArrayList<String> arr = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		while (true) { //무한반복
			// 1. 키보드로부터 문자열을 읽어 리스트에 저장한다.
			System.out.println("회원이름 입력>> ");
			String name  = sc.nextLine();
			if(name.equals("끝"))
				break;//반복 탈출
			arr.add(name);
		}//end while
		System.out.println("총회원수="+arr.size());		
		int count = 0;//갯수 저장용
		for(String s: arr) { //향상된 for문
			if(s.charAt(0) == '김')
				count++;
		}
		System.out.println("김씨 회원수="+count);		
		
	}//end main

}//end class

```

***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package day_12_03;

import java.util.ArrayList;
import java.util.Scanner;

public class TestList2 {

	public static void main(String[] args) {
		// 2. 1번을 무한 반복한다. -999입력시 저장 안함. 반복종료
		ArrayList<Integer> arr = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		while (true) { //무한반복
			// 1. 키보드로부터 숫자를 읽어 리스트에 저장한다.
			System.out.println("더할 숫자를 입력>> ");
			int num = sc.nextInt();
			//int num = Integer.parseInt(sc.nextLine());
			if(num == -999)
				break;//반복 탈출
			arr.add(num);
		}//end while
		int sum = 0;//총합 저장용
		for(int i: arr) { //향상된 for문
			sum += i; // 저장된 숫자 누적
		}
		System.out.println("숫자 통합="+sum);		
		
	}//end main

}//end class

```

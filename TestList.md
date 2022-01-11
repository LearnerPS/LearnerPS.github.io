***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package day_12_03;

import java.util.ArrayList;

public class TestList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("아이유");
		list.add("박효신");
		list.add("옥상달빛");
		System.out.println(list);

		//정수를 저장
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add( 5 );
		intList.add( 7 );
		intList.add( 9 );
		
    		//총합 계산
		int sum = 0;
		for(int i=0; i<intList.size(); i++) {
			sum += intList.get(i);
		}
		System.out.println("총합: "+sum);
		
		sum=0;
		for(int j: intList) {//향상된 for문
			sum += j;
		}
		System.out.println("총합: "+sum);
		
	}//end main

}//end class

```

***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package day_12_06;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {

	public static void main(String[] args) {

		// 항상 6개의 중복되지 않은 숫자가 저장되도록 코드를 수정해보세요.
		
		Set<Integer> is = new TreeSet<Integer>();
		for (int i = 0; i < 6; i++) {
			int r = (int)(Math.random()*45+1);//난수 6개 저장
			is.add(r);
		}//end for
		System.out.println(is);
		////////////////////////////////
		Set<Integer> is2 = new TreeSet<Integer>();
		while(is2.size()<6) {
			int r = (int)(Math.random()*45+1);//난수 6개 저장
			is2.add(r);
		}//end for
		System.out.println(is2);
		///////////////////////////
		Set<Integer> is3 = new TreeSet<Integer>();
		for(    ;  is3.size()<6 ;    ) { //  for( 변수 초기화; 반복조건; 증감식  )
			int r = (int)(Math.random()*45+1);//난수 6개 저장
			is3.add(r);
		}//end for
		System.out.println(is3);
		
	}//end main
}

```

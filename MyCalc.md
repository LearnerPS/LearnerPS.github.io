***
//내가 포기 할 때까진 아직 끝난 게 아니다
***

//이번엔 간단한 계산 기능을 가진 코드를 만들었다

***

```ruby

package day03;

/** 간단한 계산기 */
public class MyCalc {

	private int total = 0; //값 누적용
	
	int getTotal() {
		return total;
	}
	
	void add(int num) {
		total = total + num; //값 누적시키기
	}
	int add(int n1, int n2 ) {
		return n1 + n2;
	}
		
	int plus(int i1, int i2) {
		int c = i1 + i2;
		return c;
	}
	
}

```

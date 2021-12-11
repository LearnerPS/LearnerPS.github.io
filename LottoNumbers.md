***
//내가 포기 할 때까진 아직 끝난 게 아니다
***

//먼저 배열을 만든다

//로또번호 저장을 목표로 하고 있기 때문에 우선 6칸을 생성했다

***

//for문을 활용해서 정수가 랜덤하게 생성하도록 만든다

//i에 0을 넣고 위에 선언한 배열 nums의 길이보다 짧을 경우 1씩 증가하도록 조건을 건다

***

//그리고 Math.random을 활용해 난수를 발생시키고 만들어둔 배열에 집어넣도록 하면 된다

//지난번보다 업그레이드된 점은 "향상된 for문"도 사용했다는 것이다

//for(int n: nums)의 형태이다

***
```ruby

package day03;
/** 로또번호 저장객체 */
public class LottoNumbers {

	int[] nums = new int[6]; //멤버변수 = 필드
	
	/** 6개의 로또번호를 난수로 채우기 */
	public void makeNumbers() { //멤버메서드
		for(int i=0; i<nums.length; i++) {
			nums[i] = (int)(Math.random()*45+1);
		} //end for
		
	} //end makeNumbers

	public void printInfo() { //멤버메서드
		for(int n: nums) {
			System.out.print(n+" ");
		}
		System.out.println(); //공백줄 출력
	} //end printInfo()

}

```

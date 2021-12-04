
//내가 포기 할 때까진 아직 끝난 게 아니다


//저번과 마찬가지로 로또번호를 출력하는 코드를 만들며

//배열이라고 부르는 저장소를 함께 만드는 연습을 했다

//for문으로 반복이 되며, 향상된 for문이라는 것도 함께 배우고 작성을 해봤다



package day01;

public class 로또번호배열 {

	public static void main(String[] args) {

		int[] lottos = new int[6];
		for(int i=1; i<=lottos.length; i++) {//start for
			int r = (int)(Math.random()*45+1);
			lottos[ i-1 ] = r;
			System.out.println(r);
		
		} //end for
		// 전체출력
		for(int i=0; i<lottos.length; i++) {
			System.out.println(lottos[i]);			
		}
		System.out.println("길이는 "+lottos.length);
		
		//향상된 for문
		for(int n : lottos) {
			System.out.println("n="+n);			
		}
		
	} //end main
} //end class

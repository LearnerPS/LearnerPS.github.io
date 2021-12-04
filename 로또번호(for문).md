
//내가 포기 할 때까진 아직 끝난 게 아니다



//자바를 배우기 시작하며 거의 처음으로 만들어본 for문이다

//강사님의 지시로 로또번호를 출력하는 코드를 만들었다

//앞으로 로또 살 때는 이걸 먼저 돌려야겠다ㅋㅋ



package day01;

public class 로또번호 {

	public static void main(String[] args) {

		for(int i=1; i<=6; i++) {//start for
			int r = (int)(Math.random()*45+1);
			System.out.println(r);
		
		} //end for
	} //end main
} //end class

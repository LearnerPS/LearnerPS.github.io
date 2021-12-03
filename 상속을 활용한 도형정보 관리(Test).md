
//내가 포기 할 때까진 아직 끝난 게 아니다



//이번엔 도형정보다

//여태 하던대로 상속을 활용하고 선과 원의 공통 정보인 색깔과 x, y를 부모 클래스에 입력

//그 밖에 도형별로 추가하는 정보는 자식 클래스에 따로 입력해서 관리하는 코드다

//코딩 공부를 시작하기 전에 과외를 8년 정도 해오면서

//학생들에게 지름과 반지름 등의 개념을 가르쳤던 순간들이 떠오른다

//지금의 이 수학적인(?) 개념을 담은 코드들은 아직 뭔가 낮설면서도 재미있다ㅎㅎ

//이전에 했던 상품정보 관리의 틀에서 크게 벗어나지는 않아서 비교적 할만했다

//먼저 Test 클래스를 만들고 부모 클래스인 Shape, 그리고 자식 클래스인 Line과 Circle로 구성했다

package day_11_30_2;
/** 도형정보 관리 예제 */
public class TestShape {

	public static void main(String[] args) {
		Line l1 = new Line("black",3,3,9,9); //x1,y1, x2,y2 좌표값
		System.out.println(l1.getInfo());
		
		Circle c1 = new Circle("blue",3,4,12); //x1,y1, 반지름
		System.out.println(c1.getInfo());
		
		Shape s1 = l1;
		System.out.println("s1.getInfo() "+s1.getInfo());
		
		Shape[] sarr = new Shape[1000];
		sarr[0] = l1;
		sarr[1] = c1;
		System.out.println("** 전체 출력 **");
		for(int i=0; i<2; i++) {
			System.out.println(sarr[i].getInfo());
		}
	}
}

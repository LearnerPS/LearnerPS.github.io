***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
//이번엔 도형의 객체 정보를 배열에 저장하고 호출하는 공부를 해봤다

//Shape이라고 하는 부모 클래스에 각각 선과 원, 그리고 사각형의 자녀 클래스를 두고

//sarr이라는 배열을 만들어 각 도형의 객체 정보를 담는다
***

```ruby

package day_11_30_2;
/** 도형정보 관리 예제 */
public class TestShape {
	
	public static void main(String[] args) {
		Line l1 = new Line("black",3,3,9,9);//x1,y1, x2,y2 좌표값
		System.out.println( l1.getInfo() );
		
		Circle c1 = new Circle("blue", 3,4, 12); //x1,y1, 반지름
		System.out.println( c1.getInfo() );

		Shape s1 = l1;
		System.out.println("s1.getInfo() "+s1.getInfo());
			
		Shape[] sarr = new Shape[1000];
		sarr[0] = l1;
		sarr[1] = c1;

		// 사각형 객체를 만들어 배열에 저장,호출하세요.
		// draw()에서는 Rect 그리기를 출력하세요
		Rect r1 = new Rect("blue",30,40, 20,20);
		// color, x1, y1, width, height
		sarr[2] = r1;

		System.out.println("** 전체 출력 **");
		for(int i=0; i<3; i++) {
			sarr[i].draw();
		}
	}
}

```
***
//l1은 선, c1은 원, r1은 사각형의 객체 정보를 담았고

//배열의 크기는 1000으로 넉넉하게 잡았다

//도형 정보는 처음으로 겪어보는거라 조금 신기했다
***

***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
//도형 객체 정보 클래스들 중 선에 관련된 클래스이다

//솔직히 선은 그냥 일자로 쭉 그으면 되는 거라고 생각했고

//코드로 구현 하는 것도 단순할 것이라고 생각했는데..

//의외로 값이 5가지나 들어갔다

//먼저 색깔, 그리고 첫번째 점의 x좌표 값과 y좌표 값,

//그리고 두번째 점의 x좌표 값, y좌표 값이 차례대로 들어갔다

//선의 정의는 점이 연속적으로 이어지는 것이므로

//x와 y좌표의 값이 두번 들어가게 된다고 한다

//물론 어려운 개념은 아니었지만 예상과 달라서 조금 신기했다
```ruby

package day_11_30_2;
/** 선: 두점사이를 그린 도형 */
public class Line extends Shape{

	private int x2;
	private int y2;

	public Line(String color, int x1, int y1, int x2, int y2) {
		super(color, x1, y1);//부모클래스 생성자 메서드 호출
		this.x2 = x2;
		this.y2 = y2;
	}
	
  //기본생성자
	public Line() {
	}
	
  //getter/setter
	public int getX2() {
		return x2;
	}
	public void setX2(int x2) {
		this.x2 = x2;
	}
	public int getY2() {
		return y2;
	}
	public void setY2(int y2) {
		this.y2 = y2;
	}
	//현재 모든 변수정보 제공
	public String getInfo() {
		return super.getInfo()+","+x2+","+y2;
	}
	
  @Override
	public void draw() {
		System.out.println("Line Draw!!");
	}
}

```

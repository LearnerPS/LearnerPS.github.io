***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
//이번엔 원에 관련된 클래스다

//원의 도형 객체 정보를 입력할 때의 순서는

//먼저 색, 그리고 x축, y축

//그리고 반지름 순으로 입력한다고 한다
***
```ruby

package day_11_30_2;

public class Circle extends Shape{

	private int radius;

	public Circle(String color, int x1, int y1, int radius) {
		super(color,x1,y1);
		this.radius = radius;
	}
	
  public Circle() {
	}
	
  public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
  @Override
	public String getInfo() {
		return super.getInfo()+","+radius;
	}
	
  @Override
	public void draw() {
		System.out.println("Circle 그리기");
	}
	
}


```

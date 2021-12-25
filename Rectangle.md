***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
//이번엔 사각형 클래스이다

//값의 입력 순서는 색, x축, y축,

//그리고 너비와 높이를 순서대로 입력한다
***
```ruby

package day_11_30_2;

public class Rect extends Shape{

	private int width;
	private int height;

	public Rect(String color, int x1, int y1, int width, int height) {
		super(color, x1, y1);
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public String getInfo() {
		return super.getInfo()+","+width+","+height;
	}
	
  @Override
	public void draw() {
		System.out.println("Rect 그리기");
	}
}

```

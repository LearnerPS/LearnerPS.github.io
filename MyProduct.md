
***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package day04;

/** 상품정보정의용 클래스 */
public class MyProduct {

	//클래스 작성요령
	// 변수, 생성자, getter/setter, 기타 메서드 
	private String name, factory ;
	private int price;
	
	public MyProduct(String name, String factory, int price) {
		super();
		this.name = name;
		this.factory = factory;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFactory() {
		return factory;
	}

	public void setFactory(String factory) {
		this.factory = factory;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void printInfo() {
		System.out.println("name:"+name+",factory:"+factory+",price:"+price);
	}

}

```

***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package day03;

public class Book {

	private String name;
	private int price;
	private String author;
	private String publishing;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getPublishing() {
		return publishing;
	}
	
	public void setPublishing(String publishing) {
		this.publishing = publishing;
	}
	
	Book(String name, int price, String author, String publishing) {
		this.name = name;
		this.price = price;
		this.author = author;
		this.publishing = publishing;
	}
	
	public void printInfo() {
		System.out.println("이름 : "+name+" / 가격 : "+price+" / 저자 : "+author+" / 출판사 : "+publishing);
	}
}

```

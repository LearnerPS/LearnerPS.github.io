***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package day_12_08;

public class BookVo {

	private String isbn;
	private String title;
	private String pub;
	private String author;
	private int price;
	private String state = "대여가능";
	private String rentMemberId ;

	public BookVo(String isbn, String title, String pub, String author, int price) {
		this.isbn = isbn;
		this.title = title;
		this.pub = pub;
		this.author = author;
		this.price = price;
	}
	public BookVo() {
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getRentMemberId() {
		return rentMemberId;
	}
	public void setRentMemberId(String rentMemberId) {
		this.rentMemberId = rentMemberId;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPub() {
		return pub;
	}
	public void setPub(String pub) {
		this.pub = pub;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "BookVo [" + isbn + ", " + title + ", " + pub + ", " + author + ", " + price
				+ ", " + state + ", " + rentMemberId + "]";
	}

}
```

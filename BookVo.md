***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package day_12_07;

import java.io.Serializable;

public class BookVo implements Serializable{
	private String title, publisher,author, isbn;
	private int price;
	public BookVo(String title, String publisher, String author, String isbn, int price) {
		super();
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.isbn = isbn;
		this.price = price;
	}
	
	public BookVo() {
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "BookVo [" + title + ", " + publisher + ", " + author + ", " + isbn
				+ ", " + price + "]";
	}

}


```

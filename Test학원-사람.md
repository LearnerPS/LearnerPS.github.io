***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package day_12_01_3;

public class 사람 {
	private String 이름, 주민번호, 전화;

	public 사람(String 이름, String 주민번호, String 전화) {
		super();
		this.이름 = 이름;
		this.주민번호 = 주민번호;
		this.전화 = 전화;
	}
	
  public 사람() {
	}
	
  public String get이름() {
		return 이름;
	}
	public void set이름(String 이름) {
		this.이름 = 이름;
	}
	public String get주민번호() {
		return 주민번호;
	}
	public void set주민번호(String 주민번호) {
		this.주민번호 = 주민번호;
	}
	public String get전화() {
		return 전화;
	}
	public void set전화(String 전화) {
		this.전화 = 전화;
	}
	
  public String getInfo() {
		return 이름+","+ 주민번호+","+ 전화;
	}
	
}

```

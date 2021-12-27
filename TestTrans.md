***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package day_12_01_1;

public class TestTrans {

	public static void main(String[] args) {
		//상속 연습
		Trans[] tarr = new Trans[1000];
		int count = 0;
		tarr[count++] = new 승용차("1가1111","소나타",2000,5);
		tarr[count++] = new 트럭("2가1111","포터",2000,1000);
		tarr[count++] = new 승용차("1가2222","카니발",2000,7);
		tarr[count++] = new 트럭("2가2222","포터",2000,5000);

		for(int i=0; i<count; i++){
		   System.out.println( tarr[i].getInfo() );
		}
	}
}
```
***
```ruby
class Trans{
	private String 번호판;
	private String 차종;
	private int 배기량;

	public Trans(String 번호판, String 차종, int 배기량) {
		this.번호판 = 번호판;
		this.차종 = 차종;
		this.배기량 = 배기량;
	}
	
  //기본생성자 메서드
	public Trans() {
	}
	
  public String get번호판() {
		return 번호판;
	}
	public void set번호판(String 번호판) {
		this.번호판 = 번호판;
	}
	public String get차종() {
		return 차종;
	}
	public void set차종(String 차종) {
		this.차종 = 차종;
	}
	public int get배기량() {
		return 배기량;
	}
	public void set배기량(int 배기량) {
		this.배기량 = 배기량;
	}
	public String getInfo() {
		return 번호판+","+차종+","+배기량;
	}
}
```
***
```ruby
class 승용차 extends Trans{

	private int 승차인원;

	public 승용차(String 번호판, String 차종, int 배기량, int 승차인원) {
		super(번호판,  차종,  배기량);
		this.승차인원 = 승차인원;
	}
	
  //기본생성자
	public 승용차() {
	}
	
  //getter/setter
	public int get승차인원() {
		return 승차인원;
	}
	public void set승차인원(int 승차인원) {
		this.승차인원 = 승차인원;
	}
	
  @Override
	public String getInfo() {
		return super.getInfo()+","+승차인원;
	}
}
```
***
```ruby
class 트럭 extends Trans{

	private int 적재량;

	public 트럭(String 번호판, String 차종, int 배기량, int 적재량) {
		super(번호판, 차종, 배기량);
		this.적재량 = 적재량;
	}
	
  //기본생성자
	public 트럭() {
	}
	
  //getter/setter
	public int get적재량() {
		return 적재량;
	}
	public void set적재량(int 적재량) {
		this.적재량 = 적재량;
	}
	
  @Override
	public String getInfo() {
		return super.getInfo()+","+적재량;
	}
}
```
***

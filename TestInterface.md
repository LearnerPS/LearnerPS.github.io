***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package day_12_02;

public class TestInterface {

	public static void main(String[] args) {
		FlyStudent st1 = new FlyStudent("홍길동","컴공");
		
    System.out.println(st1.getInfo());
		st1.fly();
		
		Flyable f1 = st1;
		f1.fly();
 
    }//end main
    
}//end class
```
***
```ruby
class MyStudent{
	String name, hakgwa;
	
	public String getInfo() {
		return name+","+hakgwa;
	
  }

}
```
***
```ruby
class FlyStudent extends MyStudent implements Flyable{
	public FlyStudent(String name, String hakgwa) {
		this.name = name;
		this.hakgwa = hakgwa;
	}

	public void fly() {
		System.out.println("침 퉤퉤퉤~");
	
  }

}

// 비행체 정의. 날 수있는 객체
// 날아갈때 사용하는 메서드들 정의

interface Flyable{
	abstract public void fly();//날아갈때의 동작 출력
  
}
```

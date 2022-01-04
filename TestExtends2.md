***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby
package day_12_02;

public class TestExtends {

	public static void main(String[] args) {
		Student st1 = new Student("홍길동",21,"컴공");
		System.out.println( st1.getInfo() );
		
		Person p1 = st1;
		
		Emp e1 = new Emp("김길동", 35, "개발부");
		p1 = e1;
		
		Emp e2 = (Emp)p1;
		st1 = (Student)p1;
		
//		Person p3 = new Person("이길동", 10);
		
    }
    
}//end class

```
***
```ruby

abstract class Person{
	private String name;
	private int age;
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
  public Person() {
	}
	
  public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
  abstract public String getInfo() ; //자식클래스의 필수구현 메서드
	
}

```
***
```ruby

class Emp extends Person{
	String dept;
	
	public Emp(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}	
	
  public String getInfo() {
		return getName()+","+getAge()+","+dept;
	}
  
}

```
***
```ruby

class Student extends Person{
	String hakgwa;
	
	public Student(String name, int age, String hakgwa) {
		super(name, age);
		this.hakgwa = hakgwa;
	}
	
	public String getInfo() {
		return getName()+","+getAge()+","+hakgwa;
	}

}
```
***


***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
//이번엔 학생들의 이름과 학번을 관리하는 코드다

//String 타입으로 이름을, int 타입으로 학번을 받고

//getters/setters 메뉴로 private에 접근 할 수 있게 해서

//printInfo로 열람할 수 있게 만들었다

***
```ruby

package day03;

public class Student {
	
	private String name;
	private int number; //학번
		
	Student(String name, int number){
		this.name = name;
		this.number = number;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	void printInfo() {
		System.out.println("name:"+ name + "number:" + number);
		}
			
	}

```
***
//아직은 기능이 별로 없지만 앞으로 더욱 정진해서 다양한 기능을 탑재해보고 싶다

//열심히 하자!

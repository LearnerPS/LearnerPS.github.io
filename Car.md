***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package day03;

public class Car {
	
	String name;
	String type;
	double cc; //배기량
	Car(String name, String type){
		this(name, type, 0);
	}
		
	Car(String name, String type, double cc){
		this.name = name;
		this.type = type;
		this.cc = cc;
	}

	void printInfo() {
		System.out.println(
				"type:"+type+", name:"+name+", cc:"+cc);
	}
}

```

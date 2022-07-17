***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package spring_02;

public class HelloSpring {
	
	MyLog log;
	
	public void setLog(MyLog log) {
		this.log = log;
	}
	
	public String sayHello() {
		log.printLog("Hello");
		return "Hello";
	}
	
}

```

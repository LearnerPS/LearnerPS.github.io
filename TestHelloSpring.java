***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

import org.springframework.context.support.GenericXmlApplicationContext;

import spring_02.HelloSpring;

public class TestHelloSpring {

	public static void main(String[] args) {
		GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext("classpath:/config/applicationContext.xml");
		HelloSpring sp = (HelloSpring)context.getBean("hello");
		System.out.println(sp.sayHello());
	}

}


```

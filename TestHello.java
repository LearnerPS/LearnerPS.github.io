***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package spring_01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestHello {

	public static void main(String[] args) {
		//������ �����̳� �θ���
		BeanFactory context = 
//				new FileSystemXmlApplicationContext("applicationContext.xml");
//				new ClassPathXmlApplicationContext("/config/spring.xml");
				new GenericXmlApplicationContext("classpath:/config/spring.xml");
		Hello h1 = (Hello)context.getBean("hello");
		h1.sayHello();
///		
		Calc c1 = (Calc)context.getBean("calc");
		int i = c1.plus( 2,3 );
		System.out.println( i ); // 5
///		
		MySum ms = (MySum)context.getBean("mysum");
		ms.add( 1 );
		ms.add( 2 );
		int t = ms.getTotal();
		System.out.println(t); // => 3
		
	}

}


```

***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package spring_01;

import org.springframework.stereotype.Component;

@Component
public class MyBackupFile extends MyBackup {

	@Override
	public void log(String string) {
		System.out.println("backup: �������: "+string);
	}
}


```

***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package spring_01;

import org.springframework.stereotype.Component;

@Component    //�⺻�̸��� Ŭ������ ù�ڰ� �ҹ����� ���ڿ�
public class MyBackupNetwork extends MyBackup {
	@Override
	public void log(String string) {
		System.out.println("backup: ��Ʈ��ũ���: "+string);
	}
}


```

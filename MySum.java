***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package spring_01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("mysum")
public class MySum {
	
	private int total = 0;
	@Autowired //���ų� �ڽ� Ÿ���� ã�� ����. ���ų� �ڽ�Ÿ���� �������̸� ����
	@Qualifier("myBackupFile") //�̸����� ã�� ����
	private MyBackup backup ;
	
	public void setBackup(MyBackup backup) {
		this.backup = backup;
	}
	
	public void add(int i) {//�߰��Ҷ����� �� �̷��� ����Ѵ�
		//�̷¹�� ����� ��������. A�� - ȭ��, B�� - ��������, C�� - ��Ʈ��ũ ����
		backup.log("i="+i);
		total += i;
	}

	public int getTotal() {
		return total;
	}

}


```

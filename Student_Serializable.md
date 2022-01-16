***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package day_12_06;

import java.io.Serializable;

public class Student implements Serializable{
	private String name, tel, hakgwa; //이름, 전화, 학과
	private int haknyun; //학년
	
  // 모든 파라미터 받는 생성자
	public Student(String name, String tel, String hakgwa, int haknyun) {
		super();
		this.name = name;
		this.tel = tel;
		this.hakgwa = hakgwa;
		this.haknyun = haknyun;
	}

  // 기본 생성자
	public Student() {
	}

  //getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getHakgwa() {
		return hakgwa;
	}
	public void setHakgwa(String hakgwa) {
		this.hakgwa = hakgwa;
	}
	public int getHaknyun() {
		return haknyun;
	}
	public void setHaknyun(int haknyun) {
		this.haknyun = haknyun;
	}

  //toString() 모든 변수값을 문자열로 반환
	@Override
	public String toString() {
		return name + "," + tel + "," + hakgwa + "," + haknyun ;
	}
	
}

```

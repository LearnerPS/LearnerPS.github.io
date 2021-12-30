***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package day_12_01_3;

public class 강사 extends 사람 {

	private String 강의과목;

	public 강사(String 이름,  String 주민번호,  String 전화, String 강의과목) {
		super(이름, 주민번호, 전화);
		this.강의과목 = 강의과목;
	}
	
  public 강사() {
	}
	
  public String get강의과목() {
		return 강의과목;
	}
	public void set강의과목(String 강의과목) {
		this.강의과목 = 강의과목;
	}
	
  @Override
	public String getInfo() {
		return super.getInfo()+","+강의과목;
	}
}

```

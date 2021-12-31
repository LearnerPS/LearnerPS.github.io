***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package day_12_01_3;

public class 수강생 extends 사람 {

	private String 수강과목;

	public 수강생(String 이름,  String 주민번호,  String 전화, String 수강과목) {
		super(이름, 주민번호, 전화);
		this.수강과목 = 수강과목;
	}
	
  public 수강생() {
	}
	
  public void set수강과목(String 수강과목) {
		this.수강과목 = 수강과목;
	}
	public String get수강과목() {
		return 수강과목;
	}
	
  @Override
	public String getInfo() {
		return super.getInfo()+","+수강과목;
	}
}

```

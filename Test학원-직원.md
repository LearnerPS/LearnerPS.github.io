***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package day_12_01_3;

public class 직원 extends 사람 {

	private String 부서;

	public 직원(String 이름,  String 주민번호,  String 전화, String 부서) {
		super(이름, 주민번호, 전화);
		this.부서 = 부서;
	}
  
	public 직원() {
	}
  
	public String get부서() {
		return 부서;
	}
	public void set부서(String 부서) {
		this.부서 = 부서;
	}
  
	@Override
	public String getInfo() {
		return super.getInfo()+","+부서;
	}
}

```

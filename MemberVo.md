***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package day_12_08;

public class MemberVo {

	private String id;
	private String name;
	private String tel;
	private int rentCount;//대여권수
	
	public MemberVo(String id, String name, String tel) {
		this.id = id;
		this.name = name;
		this.tel = tel;
	}
	public MemberVo() {
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
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
	public int getRentCount() {
		return rentCount;
	}
	public void setRentCount(int rentCount) {
		this.rentCount = rentCount;
	}
	@Override
	public String toString() {
		return "MemberVo [id=" + id + ", " + name + ", " + tel + ", " + rentCount + "]";
	}
	
}

```

***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package org.sesac.member_06.vo;

public class MemberVo {

	private String userid, username, userpw, intro, tel;
	
	public MemberVo() {
	}

	@Override
	public String toString() {
		return "MemberVo [userid=" + userid + ", username=" + username + ", userpw=" + userpw + ", intro=" + intro
				+ ", tel=" + tel + "]";
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpw() {
		return userpw;
	}

	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public MemberVo(String userid, String username, String userpw, String intro, String tel) {
		super();
		this.userid = userid;
		this.username = username;
		this.userpw = userpw;
		this.intro = intro;
		this.tel = tel;
	}
	
}


```

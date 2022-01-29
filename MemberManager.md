***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package day_12_08;

import java.util.ArrayList;

public class MemberManager {
	private ArrayList<MemberVo> list = new ArrayList<MemberVo>();

	public void add(MemberVo vo) {
		list.add(vo);
	}
	public boolean isExist(String id) {
		for (MemberVo vo : list) {
			if(vo.getId().equals(id)) 
				return true;//같은 id찾으면 true반환, 종료
		}
		return false;
	}
	public MemberVo findById(String id) {
		for (MemberVo vo : list) {
			if(vo.getId().equals(id)) 
				return vo;//같은 id찾으면 vo반환, 종료
		}
		return null;//못찾으면 반환

	}
	public MemberVo findByName(String name) {
		for (MemberVo vo : list) {
			if(vo.getName().equals(name)) 
				return vo;//같은 name찾으면 vo반환, 종료
		}
		return null;
	}
	public boolean remove(String id) {
		for (MemberVo vo : list) {
			if(vo.getId().equals(id)) {
				list.remove(vo);
				return true;
			}
		}
		return false;
	}
	public ArrayList<MemberVo> getList() {
		return list;
	}

}


```

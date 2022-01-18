***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package day_12_06;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {
		//	학생이름별 점수
		Map<String, Integer> scoreMap = new HashMap<String, Integer>();
		scoreMap.put("홍길동", 80);
		scoreMap.put("김길동", 90);
		scoreMap.put("이길동", 85);
		System.out.println( scoreMap );
		//
		System.out.println( "김길동 점수="+scoreMap.get("김길동") );
		//김길동 점수 변경
		scoreMap.put("김길동", 95);
		System.out.println( scoreMap );
		// 없는 사람 호출
		System.out.println( "최길동 점수="+scoreMap.get("최길동") );
		
	}

}

```

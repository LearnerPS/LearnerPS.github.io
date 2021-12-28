***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package day_12_01_3;

public class Test학원 {
	public static void main(String[] args) {
		사람[] parr = new 사람[1000];
		int count = 0;
		parr[ count++ ] = new 직원("홍길동","111-222","010-111","총무부");
		parr[ count++ ] = new 직원("김길동","111-333","010-222","관리부");
		parr[ count++ ] = new 강사("박길동","111-444","010-223","자바");
		parr[ count++ ] = new 강사("이길동","111-555","010-332","파이썬");
		parr[ count++ ] = new 수강생("최길동","111-666","010-443","자바기본");
		parr[ count++ ] = new 수강생("강길동","111-777","010-553","파이썬중급");

		System.out.println("*** 전제정보 ***");
		System.out.println("총인원: "+count);
		
    for(int i=0; i<count; i++){
		   System.out.println(parr[i].getInfo());
		}
	}
}

```

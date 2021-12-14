
***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
//이번엔 영화에 관련된 정보를 입력해봤다

//생성자 메서드를 활용해 제목, 감독, 제작비의 순으로 각각의 값을 받는다

//private인 값에 접근하기 위해 Getters/Setters 메서드를 작성한다

//Source 메뉴를 통해 좀 더 빠르고 정확하게 생성이 가능했다

//그리고 마지막은 정보 출력을 위해 printInfo를 사용했다
***
```ruby

package day04;

public class Movie {
	private String title, director;
	private int cost;//제작비
	
	//생성자 메서드
	public Movie(String title, String director, int cost) {
		this.title = title;
		this.director = director;
		this.cost = cost;
	}
	//Getter/Setter 메서드 작성
	// Source 메뉴 -> Generate Getters and Setters 선택 
	//            -> Select All -> Generate 선택
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	//정보 출력
	public void printInfo() {
		System.out.println("title:"+title+",director:"+director+",cost:"+cost);
	}
}

```
***
//여러 단축키와 메뉴를 활용하니 코드 작성이 더욱 빠르고 수월해져서 좋은 것 같다ㅎㅎ

//계속해서 정진하자!
***

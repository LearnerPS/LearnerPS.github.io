***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

public class TestProduct {
	
	public static void main(String[] args) {
		//Product 클래스 테스트 코드
		//Product 배열. Product 저장할 변수를 연속 생성
		Product[] parr = new Product[100];
		int count = 0;//저장위치
		
		Product p = new Product("냉장고", "삼성", 100);
		parr[count++] = p;
		
		p = new Product("세탁기", "LG", 110);
		parr[count++] = p;
		
		parr[count++] = new Product("김치냉장고","만도",120);
		System.out.println("저장갯수="+count);
		
		System.out.println("*** 전체출력 ***");
		for(int i=0; i<count; i++) {
			parr[i].printInfo();
		}//end for
		
		//"김치냉장고"를 찾아서 가격을 130으로 변경하세요
		System.out.println("*** 김치냉장고 가격 변경");
		int findIndex = -1; //검색실패를 위해 위치번호저장용
		String findName = "김치냉장고";
		for(int i=0; i<count; i++) {
			Product pr = parr[i]; //잠시 저장. 짧은 코드를 위해
			if( pr.getName() == findName ) {
				findIndex = i;
				break;
			}
		}//end for
		
		//검색결과에따라 동작
		if(findIndex == -1) {
			System.out.println( findName+" 검색실패");
		}else {
			System.out.println( findName+" 검색 성공");
			parr[findIndex].setPrice(130);
		}
		
		System.out.println("*** 전체출력 ***");
		for(int i=0; i<count; i++) {
			parr[i].printInfo();
		}//end for
		
		//"세탁기"를 찾아서 삭제하세요.
		System.out.println("*** 세탁기 삭제");
		findIndex = -1; //검색실패를 위해 위치번호저장용
		findName = "세탁기";
		for(int i=0; i<count; i++) {
			Product pr = parr[i];//잠시 저장. 짧은 코드를 위해
			if( pr.getName() == findName ) {
				findIndex = i;
				break;
			}
		}//end for
		//검색결과에따라 동작
		if(findIndex == -1) {
			System.out.println( findName+" 검색실패");
		}else {
			System.out.println( findName+" 검색 성공");
			//정보삭제
			parr[findIndex] = parr[count-1]; //마지막정보를 삭제하려는 위치에 덮어씌우기
			parr[count-1] = null; //마지막정보 삭제
			count--; //갯수 1감소
		}
		
		System.out.println("*** 전체출력 ***");
		for(int i=0; i<count; i++) {
			parr[i].printInfo();
		}//end for

	}//end main

}//end class

```

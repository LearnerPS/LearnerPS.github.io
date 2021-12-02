//내가 포기 할 때까진 아직 끝난 게 아니다



//지난번 상속을 활용한 코드 만들기를 할 때 EMP 펄스를 맞은 것 같이 대박 꼬이는 경험을 한 이후

//반복해서 숙달하며 연습을 하기 시작했다

//오늘은 상속을 활용한 학교정보 관리를 할 거고

//우선 테스트 클래스 작성 후 학생과 직원간에 공통되는 변수는 Person이라는 부모 클래스로 넘기고

//추가적인 내용 작성은 Studend와 Emp라는 자녀 클래스에 작성해서

//상속을 이용한 정보 입력과 관리를 연습하는 게 목표다

package day_11_30_1;

public class TestSchool {

	public static void main(String[] args) {
		//학생정보:Student 이름,전번,학과
		//직원정보:Emp     이름,전번,부서
		
		//학생과 직원 공통변수는 Person: 이름,전번
		//학생: 학과만 추가
		//직원: 부서만 추가
		
		Student st1 = new Student("홍길동", "111-222", "컴공");
		st1.printInfo();
		
		Emp e1 = new Emp("김대리","111-223","총무부"); //name, tel, dept
		e1.printInfo();
		
	}//end main

}//end class

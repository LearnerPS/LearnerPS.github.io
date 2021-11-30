
//내가 포기 할 때까진 아직 끝난 게 아니다



//어제 상속을 활용해서 부모와 자식 클래스를 만들고 실행에 옮기던 중

//갑작스레 EMP폭탄을 맞았다..

//강사님이 진행해주는대로 따라 할 때는 이해가 잘 되던 것이

//막상 제로부터 내 손으로 직접 쓰기 시작하자 꼬인 것이다

//그래서 MyEmp라는 직원에 관련된 클래스를 만들었다가 빨간줄이 너무 많아져서 멘붕이 왔다

//강사님께 DM으로 궁금한 점을 여쭤보기도 하고

//처음부터 차근차근 다시 이해하며 만들어보는 것으로

//어떻게든 폭탄을 해체하게 되었다! +_+



package school;

public class MyEmp extends Person{
	private String dept;
	public MyEmp(String name, int no, String dept) {
		this.dept = dept;
		setName(name);
		setNo(no);
	}
	public void printInfo() {
		System.out.println(getName()+","+getNo()+","+dept);
	}
}

//이상의 코드는 올바로 구성된 보기에 매우 편안한 자식 클래스이고

package school;

public class MyEmp {extends Person {
	
	public MyEmp(String name, int booseo, String sabun) {
		set.dept = dept;
		this.booseo = booseo;
		this.sabun = sabun;
		setName(name, booseo, sabun);
		
	}

	public void printInfo() {
		System.out.println(setname+","+setbooseo+","+setsabun);
		
	}

}//end class

//이상의 코드는 내가 멘붕이 온 후 작성을 종료했던 시점이다

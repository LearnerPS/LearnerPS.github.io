
//내가 포기 할 때까진 아직 끝난 게 아니다



//어제 상속을 활용해서 부모와 자식 클래스를 만들고 실행에 옮기던 중

//갑작스레 EMP폭탄을 맞았다..

//강사님이 진행해주는대로 따라 할 때는 이해가 잘 되던 것이

//막상 제로부터 내 손으로 직접 쓰기 시작하자 꼬인 것이다

//그래서 MyEmp라는 직원에 관련된 클래스를 만들었다가 빨간줄이 너무 많아져서 멘붕이 왔다

//강사님께 DM으로 궁금한 점을 여쭤보기도 하고

//처음부터 차근차근 다시 이해하며 만들어보는 것으로

//어떻게든 폭탄을 해체하게 되었다! +_+

===========================================================

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

===========================================================

//이상의 코드는 올바로 구성된 보기에 매우 편안한 자식 클래스이고

===========================================================

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

===========================================================

//이상의 코드는 내가 멘붕이 온 후 작성을 종료했던 시점이다

//먼저 " MyEmp {extends " 파트에서 중괄호 오타가 나와서 빨간줄이 시작되었다..

//그리고 강사님이 설명 하실 때 사번이나 부서는 no와 dept로 생성되었는데..

//나 혼자 실습하면서 no를 sabun으로, dept를 booseo로 사용하는 바람에

//기존에 부모 클래스 Person에서 선언해놓았던 no가 호환이 안되게 되버렸다..

//현업에서는 위와 같이 소리나는 대로 이름을 정하는 경우가 있다고 들었는데

//아무래도 너무 과한 의욕에 앞뒤 분간을 못한 것 같다.. 하하..

//오타를 고치고, 일치하지 않는 메서드의 이름을 수정하고 보니..

//private String으로 써야했던 dept가 안보이는 것이 눈에 띄었다

//그래서 빠뜨렸던 부분을 다시 작성했고..

//마지막으로 "this." 와 "set" 파트를 올바르게 수정했다

//부모 클래스에서 "private String name;"과 "private int no;"가 이미 선언이 되었기 때문에

//거기에 있는 것을 getter/setter 메서드 기능을 활용하여 가져다 쓰기만 하면 되고

//또 자식 클래스 MyEmp에서 새롭게 추가하는 내용 dept만 private으로 String을 생성해두면 되는 거였는데..

//extends 파트부터 오타가 나오고, 알 수 없는 빨간줄이 계속 이어지자 당황을 했던 것 같다..

//조금만 충분히 생각해보면 알 수 있는 내용이었는데.. 후회가 된다.. 다음부턴 정신 바짝 차려야지!

//최종적으로 "set.dept = dept;"는 "this.dept = dept;"로 올바르게 수정했고,

//멘붕이 온 상태에서 마구 작성했던 "this.booseo = booseo;"와 "this.sabun = sabun;"은

//부모 클래스인 Person에 선언된 내용을 상속받아 쓸 수 있게 "setName(name);", "setNo(no);"로 대체하였다

//끝에 PrintInfo의 파트는 딱히 코드가 틀린 것이 아니라

//부모 클래스와 자식 클래스 간에 서로 다른 이름을 작성해서 생긴 빨간줄이었기 때문에

//이름을 올바르게 수정하는 것으로 바로 해결될 수 있었다

//골머리 썩히던 녀석을 완벽정복하고 오류가 없는 코드를 바라보니 마음이 흐뭇하다 하하

//이제는 당황하지 말고 조금 더 세심하게 코드를 바라볼 수 있는 눈을 길러야 하겠다

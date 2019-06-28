
public class ChildB extends FinalC {

	int field2=1;
	ChildB(){}
	
/*	ChildB(int f2){
		// 부모 클래스에 기본 생성자가 없을 경우 super를 한번 호출 해야된다.
		super(f2);
	}
	
	@Override
	void method1() {
		//Final로 선언된 필드나 메소드는 자식 클래스에서 재정의 불가능
		System.out.println("자식클래스에서 재정의한 부모클래스의 method1이다.");
	}
	*/
	void method2() {
		System.out.println("자식 클래스다.");
	}
}

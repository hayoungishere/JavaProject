
public class ParentA {
	int field1=10;
	
	ParentA(){}
	
	ParentA(int f1){
		this.field1=f1;
	}
	int getField() {
		return field1;
	}
	void method1() {
		System.out.println("부모클래스다.");
	}
}

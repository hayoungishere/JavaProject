package bigdata;

public class ParentA {
	int field1=10;
	
	public ParentA(){}
	
	public ParentA(int f1){
		this.field1=f1;
	}
	int getField() {
		return field1;
	}
	public void method1() {
		System.out.println("부모클래스다.");
	}
}

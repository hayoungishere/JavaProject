
public class ChildB extends FinalC {

	int field2=1;
	ChildB(){}
	
/*	ChildB(int f2){
		// �θ� Ŭ������ �⺻ �����ڰ� ���� ��� super�� �ѹ� ȣ�� �ؾߵȴ�.
		super(f2);
	}
	
	@Override
	void method1() {
		//Final�� ����� �ʵ峪 �޼ҵ�� �ڽ� Ŭ�������� ������ �Ұ���
		System.out.println("�ڽ�Ŭ�������� �������� �θ�Ŭ������ method1�̴�.");
	}
	*/
	void method2() {
		System.out.println("�ڽ� Ŭ������.");
	}
}

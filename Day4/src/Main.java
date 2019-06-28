import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentA a = new ParentA();
		ChildB b =  new ChildB();
		
		a.field1=0;
		b.field2=10;
		
		System.out.println("a.field1 : "+a.field1); // ������ a ��ü���� ����� �ʵ�1�� ��
		System.out.println("b.field1 : "+b.field2); // b�� ��ӹ��� �θ� Ŭ������ ����� �ʵ�1�ǰ�(���� default value�� ���� ����)
		System.out.println("b.field2 : "+b.field2); // ������ b ��ü���� ����� �ʵ�2�� ��
		
		b.method1();

		
		// �ڵ���
		Car car = new HyundaiCar();
		car.run();
		
		Car selectCar;
		Scanner sc = new Scanner(System.in);
		System.out.print("�ڵ����� ������[1.����  2.���  3.BMW]");
		int selectNum=sc.nextInt();
		
		//���õ� �ڵ��� ��ü ����
		/*switch(selectNum) {
		case 1:
			selectCar = new HyundaiCar();
			break;
		case 2:
			selectCar = new KiaCar();
			break;
		case 3:
			selectCar = new BmwCar();
			break;
		}
		*/
		if(selectNum==1)
			selectCar=new HyundaiCar();
		else if(selectNum==2)
			selectCar=new KiaCar();
		else
			selectCar=new BmwCar();
		
		
		selectCar.run();
		selectCar.stop();
		
			
	}

}

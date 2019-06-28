import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentA a = new ParentA();
		ChildB b =  new ChildB();
		
		a.field1=0;
		b.field2=10;
		
		System.out.println("a.field1 : "+a.field1); // 생성된 a 객체에서 변경된 필드1의 값
		System.out.println("b.field1 : "+b.field2); // b가 상속받은 부모 클래스에 선언된 필드1의값(현재 default value를 갖고 있음)
		System.out.println("b.field2 : "+b.field2); // 생성된 b 객체에서 변경된 필드2의 값
		
		b.method1();

		
		// 자동차
		Car car = new HyundaiCar();
		car.run();
		
		Car selectCar;
		Scanner sc = new Scanner(System.in);
		System.out.print("자동차를 고르세요[1.현대  2.기아  3.BMW]");
		int selectNum=sc.nextInt();
		
		//선택된 자동차 객체 생성
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

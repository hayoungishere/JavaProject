
public class CarExcuteClass {
	public static void main(String[] args) {
		Car defaultCar= new Car();
		Car overCar=new Car("����","A","red",50,50);
		
		System.out.println(defaultCar.carColor);
		System.out.println(overCar.carColor);
		
		
		// �õ��� �ɸ�
		defaultCar.startOn();
		
		int speed=defaultCar.run();
		System.out.println(speed);
		
	}
}

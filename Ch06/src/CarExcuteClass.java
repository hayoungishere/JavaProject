
public class CarExcuteClass {
	public static void main(String[] args) {
		Car defaultCar= new Car();
		Car overCar=new Car("현대","A","red",50,50);
		
		System.out.println(defaultCar.carColor);
		System.out.println(overCar.carColor);
		
		
		// 시동이 걸림
		defaultCar.startOn();
		
		int speed=defaultCar.run();
		System.out.println(speed);
		
	}
}

package carProject;

public class HyundaiCar implements Car {

	int speed;
	
	@Override
	public void startOn() {
		System.out.println("�õ� �ɸ�");
		this.speed=0;
	}
	
	@Override
	public int run() {
		this.speed+=10;
		return this.speed;
	}
	
	
	@Override
	public int reduceSpeed() {
		// TODO Auto-generated method stub
		this.speed-=10;
		return this.speed;
	}
	
	@Override
	public int getSpeed() {
		return this.speed;
	}
}

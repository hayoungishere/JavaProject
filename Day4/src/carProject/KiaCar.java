package carProject;

public class KiaCar implements Car {

	int speed;
	@Override
	public void startOn() {
		// TODO Auto-generated method stub
		System.out.println("시동 걸림.");
		speed=0;
	}

	@Override
	public int run() {
		// TODO Auto-generated method stub
		this.speed+=5;
		return this.speed;
	}

	@Override
	public int reduceSpeed() {
		// TODO Auto-generated method stub
		this.speed-=5;
		return this.speed;
	}
	
	@Override
	public int getSpeed() {
		return this.speed;
	}

}

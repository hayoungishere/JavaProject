
public class Car {
	
	//Fields
	String carType = "";
	String carColor = "";
	private int maxSpeed = 0;
	private int speed = 0;
	private int cc = 0;
	
	
	
	// Getter & Setter
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}

	
	//Method
	void run() {
		System.out.println("�ڵ��� �޸���");
	}
	
	void stop() {
		System.out.println("�ڵ��� �����.");
	}
	
	void navigation() {
		System.out.println("�� �ȳ��Ѵ�.");
	}


}

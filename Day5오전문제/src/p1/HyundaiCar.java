package p1;

public class HyundaiCar implements Car {
	public String carModel="";
	public String carColor="";
	public int cc=0;
	
	public int speed;
	
	public HyundaiCar() {
		this.carColor="";
		this.carModel="";
		this.cc=0;
		this.speed=0;
	}

	
	
	@Override
	public void startOn() {
		System.out.println("�����ڵ����� �õ��� �ɾ���.");
	}
	
	@Override
	public int getCurSpeed() {
		return this.speed;
	}
	
	@Override
	public void addSpeed() {
		this.speed+=5;
		getCurSpeed();
	}
	
	@Override
	public void subSpeed() {
		this.speed-=5;
		getCurSpeed();
	}
	
	@Override
	public void stop() {
		System.out.println("�����ڵ��� �õ��� ����.");

	}
	
	@Override
	public void excute() {
		System.out.println("�����մϴ�.");
	}



	public String getCarModel() {
		return carModel;
	}



	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}



	public String getCarColor() {
		return carColor;
	}



	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	
	
}

package p1;

public class KiaCar implements Car {
	public String carModel="";
	public String carColor="";
	public int cc=0;
	
	public int speed;
	
	
	
	public KiaCar(){
		this.carColor="";
		this.carModel="";
		this.cc=0;
		this.speed=0;
	}
	
	
	
	@Override
	public void startOn() {
		// TODO Auto-generated method stub
		System.out.println("����ڵ����� �õ��� �ɾ���.");
	}

	@Override
	public int getCurSpeed() {
		// TODO Auto-generated method stub
		return this.speed;
	}

	@Override
	public void addSpeed() {
		// TODO Auto-generated method stub
		this.speed+=7;
		getCurSpeed();
	}

	@Override
	public void subSpeed() {
		// TODO Auto-generated method stub
		this.speed-=7;
		getCurSpeed();
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("����ڵ��� �õ��� ����.");
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



	@Override
	public void excute() {
		// TODO Auto-generated method stub
		System.out.println("�����մϴ�.");
	}

	
}

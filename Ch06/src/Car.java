
public class Car {
	String company="";
	String carType="";
	String carColor="";
	int maxSpeed=0;
	int cc=0;
	boolean status=false;
	
	Car(){
		// default initializer
		System.out.println("생성자 호출됨");
		this.company="기아자동차";
		this.carType="아반떼";
		this.carColor="보라";
	}
	
	Car(String company, String carType, String carColor, int maxSpeed, int cc){
		// overloaded initializer
		System.out.println("called overloading initializer");
		this.company=company;
		this.carType=carType;
		this.carColor=carColor;
		this.maxSpeed=maxSpeed;
		this.cc=cc;
	}
	
	void startOn() {
	// 시동을 걸었을때
		this.status=true;
		System.out.println("시동 걸렸다.");
	}
	
	void stopOn() {
	// 시동을 껐을때
		this.status=false;
		System.out.println("시동 꺼졌다.");
	}
	
	int run() {
		return this.maxSpeed;
	}
	
}

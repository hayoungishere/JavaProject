
public class Car {
	String company="";
	String carType="";
	String carColor="";
	int maxSpeed=0;
	int cc=0;
	boolean status=false;
	
	Car(){
		// default initializer
		System.out.println("������ ȣ���");
		this.company="����ڵ���";
		this.carType="�ƹݶ�";
		this.carColor="����";
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
	// �õ��� �ɾ�����
		this.status=true;
		System.out.println("�õ� �ɷȴ�.");
	}
	
	void stopOn() {
	// �õ��� ������
		this.status=false;
		System.out.println("�õ� ������.");
	}
	
	int run() {
		return this.maxSpeed;
	}
	
}

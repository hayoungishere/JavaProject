
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Car car = new Car();
		car.setCarModel("�׷���");
		car.setCarColor("�Ķ�");
		
		
		System.out.println("�� : "+car.getCarModel()+"\n���� : " + car.getCarColor());
	
		System.out.println(car.toString());
	
		
		car=null;
		
		System.gc(); //Garbage Collector �����.
	}

}

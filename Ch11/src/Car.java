
public class Car {
	
	
	private String carModel;
	private String carColor;
	
	
	public Car() {} //Default Constructor
 	
	public Car(String carModel, String carColor) {
		super();
		this.carModel = carModel;
		this.carColor = carColor;
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
	public String toString() {
		return "Car [carModel=" + carModel + ", carColor=" + carColor + "]";
	}
	
	
	@Override
	public void finalize() {
		//불 필요한 메모리 반환이 이뤄짐.
		System.out.println("finalize 실행됨.");
	}
	


	public void excute() {
		// TODO Auto-generated method stub
		System.out.println("Excute 실행");
	}
	
	
}

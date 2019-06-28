
public class BmwCar extends Car{

	//Override Methods
	@Override
	void run() {
		System.out.println("bmw자동차 달린다");
	}
	@Override
	void stop() {
		System.out.println("bmw자동차 멈춘다.");
	}
	@Override
	void navigation() {
		System.out.println("(bmw) 길 안내한다.");
	}
	
}

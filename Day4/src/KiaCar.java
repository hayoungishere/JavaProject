
public class KiaCar extends Car{

	//Override Methods
	@Override
	void run() {
		System.out.println("기아자동차 달린다");
	}
	@Override
	void stop() {
		System.out.println("기아자동차 멈춘다.");
	}
	@Override
	void navigation() {
		System.out.println("(기아) 길 안내한다.");
	}
	
}

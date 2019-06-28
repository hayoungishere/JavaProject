
public interface RemoteControl {

	//CONSTANT variables
	public int MAX_VOLUME=10;
	public int MIN_VOLUME=0;

	//Abstract method
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	//Default method
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리한다.");
		}else {
			System.out.println("무음 해제한다.");
		}
	}

	//static method
	static void changeBattery() {
		System.out.println("건전지 바꿔라");
	}
}

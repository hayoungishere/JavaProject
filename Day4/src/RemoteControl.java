
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
			System.out.println("���� ó���Ѵ�.");
		}else {
			System.out.println("���� �����Ѵ�.");
		}
	}

	//static method
	static void changeBattery() {
		System.out.println("������ �ٲ��");
	}
}


public class TelevisionClass implements RemoteControl {

	//Abstract method
		@Override
		public void turnOn() {
			System.out.println("전원 켠다.");
		}
		@Override
		public void turnOff() {
			System.out.println("전원 끈다.");
		}
		
		@Override
		public void setVolume(int volume) {
			System.out.println("볼륨 조절한다.");
		}
}

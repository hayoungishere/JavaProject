
public class TelevisionClass implements RemoteControl {

	//Abstract method
		@Override
		public void turnOn() {
			System.out.println("���� �Ҵ�.");
		}
		@Override
		public void turnOff() {
			System.out.println("���� ����.");
		}
		
		@Override
		public void setVolume(int volume) {
			System.out.println("���� �����Ѵ�.");
		}
}

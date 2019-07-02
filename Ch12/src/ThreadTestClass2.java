
public class ThreadTestClass2 extends Thread{

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("ÇöÀç  thread : "+Thread.currentThread().getName()+"   / i°ª : "+ i);
		
		}
	}
	
}

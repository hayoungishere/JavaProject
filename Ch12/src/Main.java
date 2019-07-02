
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadTestClass ttc = new ThreadTestClass();
		Thread thread = new Thread(ttc);
		Thread thread1 = new Thread(ttc);
		
		thread.start();
		thread1.start();
		
		/*for(int i=0; i<10; i++) {
			System.out.println("Main i °ª : "+i);
			
			
			
		try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		
	}

}

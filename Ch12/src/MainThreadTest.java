
public class MainThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable ttc3=new ThreadTestClass3();
		Thread thread = new Thread(ttc3,"A");
		Thread thread1 = new Thread(ttc3,"B");
		
		thread.start();
		thread1.start();
		
	}

}

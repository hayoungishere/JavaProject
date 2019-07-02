
public class ThreadTestClass3 implements Runnable {

	int iValue=0;
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++) {
			if(Thread.currentThread().getName().equals("A"))
				iValue++;
			System.out.println("Thread ÀÌ¸§ : "+Thread.currentThread().getName()+" & iValue = "+iValue);

		}
		
	}

}

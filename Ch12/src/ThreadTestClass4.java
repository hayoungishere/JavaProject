
public class ThreadTestClass4 implements Runnable {

	int iValue=0;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized(this){ //클래스 자체를 동기화 한다.
		for(int i=0; i<10; i++) {
			if(Thread.currentThread().getName().equals("A"))
				iValue++;
			System.out.println("Thread 이름 : "+Thread.currentThread().getName()+" & iValue = "+iValue);

		}
		}
	}

}

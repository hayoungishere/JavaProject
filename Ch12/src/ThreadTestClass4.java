
public class ThreadTestClass4 implements Runnable {

	int iValue=0;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized(this){ //Ŭ���� ��ü�� ����ȭ �Ѵ�.
		for(int i=0; i<10; i++) {
			if(Thread.currentThread().getName().equals("A"))
				iValue++;
			System.out.println("Thread �̸� : "+Thread.currentThread().getName()+" & iValue = "+iValue);

		}
		}
	}

}

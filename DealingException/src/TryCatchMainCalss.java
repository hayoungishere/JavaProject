
public class TryCatchMainCalss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	try {
		String s = null;
		System.out.println(s.toString());
			
	}catch(NullPointerException e) {
		System.out.println("���ܰ� �߻��߽��ϴ�.");
	}finally {
		System.out.println("finally ����");
	}
	
	
	
	
	}

}

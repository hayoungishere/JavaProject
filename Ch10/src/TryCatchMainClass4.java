
public class TryCatchMainClass4 {

	public static void main(String[] args) {
		try {
			throw new MyException();
			
		}catch(MyException e) {
	
			System.out.println("MyException ����ó���� �߻��޴�.");
		}catch(Exception e) {
		System.out.println("Exption ����ó���� �߻��ߴ�.");	
		}
	}
	
}

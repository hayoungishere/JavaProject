
public class TryCatchMainClass4 {

	public static void main(String[] args) {
		try {
			throw new MyException();
			
		}catch(MyException e) {
	
			System.out.println("MyException 예외처리가 발생햇다.");
		}catch(Exception e) {
		System.out.println("Exption 예외처리가 발생했다.");	
		}
	}
	
}

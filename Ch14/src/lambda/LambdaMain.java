package lambda;

public class LambdaMain implements MyFunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyFunctionalInterface lc = new MyFunctionalInterface();
		lc.method();
		
		MyFunctionalInterface lc2 = new MyFunctionalInterface() {
			@Override
			public void method() {
				System.out.println("lc2");
			}
			
			//@Override
			public void method2() {
				System.out.println("lc2 method2");
			}
		}
		
		MyFunctionalInterface lc3 = () ->{
			
		}
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		
	}

}

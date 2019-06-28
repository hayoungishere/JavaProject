
public class CalculatorClass {
	
	int result;
	
	CalculatorClass(){
		//default initializer
		this.result=0;
	}

	int sum(int a, int b) {
		this.result=a+b;
		return this.result;
		//return a+b;
	}
	
	int sub(int a, int b) {
		return a-b;
	}
	
	int mul(int a, int b) {
		return a*b;
	}
	
	int div(int a, int b) {
		return a/b;
	}
	
	


}

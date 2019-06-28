import java.util.Scanner;


public class CalculatorMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("계산식을 입력해라");
		
		CalculatorClass calculator = new CalculatorClass();
		
		String operand="";
		int first, second,result=0;
	
		first=sc.nextInt();
		operand=sc.next();
		second=sc.nextInt();
		
		switch(operand) {
		case "+":
			result=calculator.sum(first, second);
			break;
		case "-":
			result=calculator.sub(first, second);
			break;
		case "*":
			result=calculator.mul(first, second);
			break;
		case "/":
			result=calculator.div(first,second);
			break;
		}
		
		System.out.println("결과는 "+result);
		
		
		

		
		// Split String
		
		String op=sc.next();
		String oper="";
		int f=0,s=0,r=0;

		for(int i=0; i<op.length(); i++) {
		
			if(op.substring(i,i+1).equals("+") || op.substring(i,i+1).equals("-")|| op.substring(i,i+1).equals("*") || op.substring(i,i+1).equals("/")) {
				f=Integer.parseInt(op.substring(0, i));
				s=Integer.parseInt(op.substring(i+1, op.length()));
				oper=op.substring(i,i+1);
				break;
			}
		}
		
		
		switch(oper) {
		case "+":
			r=calculator.sum(f,s);
			break;
		case "-":
			r=calculator.sub(f,s);
			break;
		case "*":
			r=calculator.mul(f,s);
			break;
		case "/":
			r=calculator.div(f,s);
			break;
		}
		
		System.out.println("결과는 "+r);
	}

}

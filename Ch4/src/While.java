import java.util.Scanner;
public class While {

	public static void main(String[] args) {
		int value=3;
		while (value<10) {
			System.out.println(value);
			++value;
		}
		
		Scanner sc= new Scanner(System.in);
		/*while(true) {
			System.out.print("���ο� ���ڸ� �Է��ض� : ");
			value=sc.nextInt();

			if (value==0) break;
		}*/
		
		int inValue=0;
		do {
			inValue++;
			System.out.println(inValue);
		}while(inValue<1);
		
		
		
	}
	
	
	
}

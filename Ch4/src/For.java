import java.util.Scanner;
public class For {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��ض�");
		int inputValue=sc.nextInt();
		
		int sum=0;
		for (int i=1; i<=inputValue; i++) {
			if(i%2==0) {
				sum+=i;
				System.out.println(i+"�� ¦���Դϴ�.");} 
			else System.out.println(i+"�� Ȧ���Դϴ�.");
		}
		
		System.out.println(sum);
	}
}

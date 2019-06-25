import java.util.Scanner;
public class For {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력해라");
		int inputValue=sc.nextInt();
		
		int sum=0;
		for (int i=1; i<=inputValue; i++) {
			if(i%2==0) {
				sum+=i;
				System.out.println(i+"는 짝수입니다.");} 
			else System.out.println(i+"는 홀수입니다.");
		}
		
		System.out.println(sum);
	}
}

package pattern;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String regExp="010-\\d{3,4}-\\d{4}";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��ȭ��ȣ �Է��ض�");
		
		String s = sc.nextLine();
		
		System.out.println(Pattern.matches(regExp, s));
		
		if(Pattern.matches(regExp, s)) {
			System.out.println("��ȭ��ȣ�� ���������� �Է��Ͽ����ϴ�.");
		}else {
			System.out.println("��ȭ��ȣ �ٽ� �Է� �ض� --");
		}
		
	}

}

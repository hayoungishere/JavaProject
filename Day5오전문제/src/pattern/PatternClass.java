package pattern;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String regExp="010-\\d{3,4}-\\d{4}";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("전화번호 입력해라");
		
		String s = sc.nextLine();
		
		System.out.println(Pattern.matches(regExp, s));
		
		if(Pattern.matches(regExp, s)) {
			System.out.println("전화번호를 정상적으로 입력하였습니다.");
		}else {
			System.out.println("전화번호 다시 입력 해라 --");
		}
		
	}

}

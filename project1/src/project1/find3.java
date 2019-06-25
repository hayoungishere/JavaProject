package project1;

import java.util.Scanner;

public class find3 {
	// 3항 연산자 연습
	// 3의 배수 찾기!!
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요");
		int inputValue=sc.nextInt();
		
		for (int i=1; i<=inputValue; i++) {
			System.out.println(i%3==0?i:"");
		}
		
		
		System.out.println(inputValue%3==0?"3의 배수다":"3의 배수 아니다");
	}
}

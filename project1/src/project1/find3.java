package project1;

import java.util.Scanner;

public class find3 {
	// 3�� ������ ����
	// 3�� ��� ã��!!
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է����ּ���");
		int inputValue=sc.nextInt();
		
		for (int i=1; i<=inputValue; i++) {
			System.out.println(i%3==0?i:"");
		}
		
		
		System.out.println(inputValue%3==0?"3�� �����":"3�� ��� �ƴϴ�");
	}
}

package project1;

public class OperatorTwoClass {
	public static void main(String[] args) {
		
		int intValue=10;
		int intValue2=5;
		
		System.out.println(intValue+intValue2);
		System.out.println(intValue-intValue2);
		System.out.println(intValue*intValue2);
		System.out.println(intValue/intValue2);
		System.out.println(intValue%intValue2);
		
		
		//���� ������ ���ڿ�
		String s1 = "Hello"; // ���ڿ� ������ ����
		String s2 = "World";
		
		System.out.println(s1+s2);
		
		//�� ������ boolean
		System.out.println(3!=3);
		
		Boolean[] li= {true, true, false, false} ;
		Boolean[] li2= {true, false, true, false} ;
		
		System.out.println("AND");
		for (int i =0; i<4; i++) {
			System.out.println(li[i] && li2[i]);
		}
		System.out.println("OR");
		for (int i =0; i<4; i++) {
			System.out.println(li[i] || li2[i]);
		}
		
		
		// 3�� ������
		/*
		 ���ǹ� ? true�϶� : false�϶� 

		["if ���ǹ�
			return true
		else
			return false"]�� ���� �����̴�!!!
		 */
		
		int score=81;
		System.out.println(score>80?'A':'B');
		
		
		
		
		
		
	}
}

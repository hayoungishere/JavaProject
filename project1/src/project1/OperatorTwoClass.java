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
		
		
		//이항 연산자 문자열
		String s1 = "Hello"; // 문자열 참조형 변수
		String s2 = "World";
		
		System.out.println(s1+s2);
		
		//비교 연산자 boolean
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
		
		
		// 3항 연산자
		/*
		 조건문 ? true일때 : false일때 

		["if 조건문
			return true
		else
			return false"]와 같은 구문이다!!!
		 */
		
		int score=81;
		System.out.println(score>80?'A':'B');
		
		
		
		
		
		
	}
}

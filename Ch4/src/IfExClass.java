import java.util.*;
public class IfExClass {
	public static void main(String[] args) {
		/*
		 * 조건문
		 if(조건문 ) {
		  	true일때 실행되어야 할 코드
		  }else{
		  	조건문이 false일때 실행되어야 할 코드
		  }
		 */
	
		boolean flag1 = false;
		Scanner sc = new Scanner(System.in);
		int inputValue=sc.nextInt();
		if(inputValue<10) {
			System.out.println(inputValue+"는 10 미만이다.");
		}else {

			System.out.println("입력된 값은 10 이상이다");
		}
		
		int korean=sc.nextInt();
		int english=sc.nextInt();
		int math=sc.nextInt();
		
		int avg=(korean+english+math)/3;
		System.out.println("세 과목의 평균 점수는 "+ avg +"입니다.");
		System.out.println(korean>avg?"국어점수("+korean+")는 평균보다 높다":"국어 점수("+korean+")는 평균보다 낮다.");
		System.out.println(math>avg?"수학점수("+math+")는 평균보다 높다":"수학 점수("+math+")는 평균보다 낮다.");
		System.out.println(english>avg?"영어점수("+english+")는 평균보다 높다":"영어 점수("+english+")는 평균보다 낮다.");
		
		
		/* Switch Case 문 */
		
		switch(avg) {
			case 70:
				System.out.println("C");
				break;
			case 80 : 
				System.out.println("B");
				break;
			case 90:
				System.out.println("A");
				break;
			default:
				System.out.println("F");
				break;
		}
		
		
		
		for( int i=0; i<5; ++i) {
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}

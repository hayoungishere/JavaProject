import java.util.*;
public class IfExClass {
	public static void main(String[] args) {
		/*
		 * ���ǹ�
		 if(���ǹ� ) {
		  	true�϶� ����Ǿ�� �� �ڵ�
		  }else{
		  	���ǹ��� false�϶� ����Ǿ�� �� �ڵ�
		  }
		 */
	
		boolean flag1 = false;
		Scanner sc = new Scanner(System.in);
		int inputValue=sc.nextInt();
		if(inputValue<10) {
			System.out.println(inputValue+"�� 10 �̸��̴�.");
		}else {

			System.out.println("�Էµ� ���� 10 �̻��̴�");
		}
		
		int korean=sc.nextInt();
		int english=sc.nextInt();
		int math=sc.nextInt();
		
		int avg=(korean+english+math)/3;
		System.out.println("�� ������ ��� ������ "+ avg +"�Դϴ�.");
		System.out.println(korean>avg?"��������("+korean+")�� ��պ��� ����":"���� ����("+korean+")�� ��պ��� ����.");
		System.out.println(math>avg?"��������("+math+")�� ��պ��� ����":"���� ����("+math+")�� ��պ��� ����.");
		System.out.println(english>avg?"��������("+english+")�� ��պ��� ����":"���� ����("+english+")�� ��պ��� ����.");
		
		
		/* Switch Case �� */
		
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

package member;

import java.util.Scanner;

public class OperationClass {

	public static void main(String[] args) {
		int work;
		
		ManagerClass manager = new ManagerClass();
		Scanner scanner = new Scanner(System.in);
		
		//while(true) {
			System.out.println("�α����� ���ּ���");
			System.out.print("���̵� : ");
			String id = sc.next();
			
			System.out.print("��й�ȣ : ");
			String pw= sc.next();
			
			
			
			manager.searchUser();
			
			
			
			/*System.out.println("���Ͻô� �۾��� ���ؼ� ��ȣ�� �Է����ּ���(1.ȸ���˻�, 2.ȸ�����, 3.ȸ������, 4.ȸ������, 5.����)");
			System.out.print("��ȣ �Է� : ");
			work = scanner.nextInt();
			
			if(work==1) {
				manager.searchUser();
				
			}else if(work==2){
				manager.joinMembership();
				
			}else if(work==3) {
				manager.modifyUser();
				
			}else if(work==4) {
				manager.deleteUser();
				
			}else {
				manager.systemOut();
				break;	
				
			}*/
		//}	
	}
}

package member;

import java.util.Scanner;

public class OperationClass {

	public static void main(String[] args) {
		int work;
		
		ManagerClass manager = new ManagerClass();
		Scanner scanner = new Scanner(System.in);
		
		//while(true) {
			System.out.println("로그인을 해주세요");
			System.out.print("아이디 : ");
			String id = sc.next();
			
			System.out.print("비밀번호 : ");
			String pw= sc.next();
			
			
			
			manager.searchUser();
			
			
			
			/*System.out.println("원하시는 작업을 위해서 번호를 입력해주세요(1.회원검색, 2.회원등록, 3.회원수정, 4.회원삭제, 5.종료)");
			System.out.print("번호 입력 : ");
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

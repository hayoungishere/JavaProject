package member;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MemberManageMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Member> memberList = new ArrayList<Member>();
		Map<Integer, Member> member= new HashMap<Integer, Member>();
		 
		
		int input;
		while(true) {
			System.out.print("��ȣ �Է��ض�=>[1:ȸ���˻�, 2:ȸ�����, 3:ȸ������, 4:ȸ������, 5:������]");
			input=sc.nextInt();
			if(input==1) {
				
				Set<String> set = member.keySet();
				
				Iterator<String> iterator = set.iterator();
				
				while(iterator.hasNext()) {
					String s = iterator.next();
					System.out.println("############################");
					System.out.println(member.get(s).getId());
					System.out.println(member.get(s).getPhoneNumber());
					System.out.println(member.get(s).getPwd());
					System.out.println(member.get(s).getAge());
					System.out.println(member.get(s).getAddress());
				}
				
			
			}else if(input==2) {
				Member newMember=new Member();
				String inputId, inputPN, inputPWD, inputAge, inputAdd;
				System.out.print("id : ");
				newMember.setId(sc.next());
				
				System.out.print("��ȭ��ȣ : ");
				newMember.setPhoneNumber(sc.next());
				
				System.out.print("��й�ȣ : ");
				newMember.setPwd(sc.next());
				
				System.out.print("���� : ");
				newMember.setAge(sc.next());
				
				System.out.print("�ּ� : ");
				newMember.setAddress(sc.next());
				
				int memberLength=member.size();
				
				//memberList.add(newMember);
				
				
			}else if(input==3) {
				String inputId;
				System.out.print("���� �ϰ��� �ϴ� id�� �Է��ض� : ");
				inputId=sc.next();
				memberList.get(inputId);
				
			}else if(input==4) {
				
			}else if(input==5){
				break;
			}else {
				System.out.println("�Է� �߸��ߴ�. �ٽ� �Է��ϼ���");
				continue;
			}
			
			
		}
	
	
	
	
	
	
	
	}
	
}

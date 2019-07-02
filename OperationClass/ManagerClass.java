package member;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ManagerClass {
	String id;
	String pwd;
	String addr;
	String phoneNumber;
	String age;
	String password;
	MemberClass userdata;

	ManagerClass() {
	}

	Map<String, MemberClass> map = new HashMap<String, MemberClass>();
	Map<String, String> map1 = new HashMap<String, String>();
	Scanner scanner = new Scanner(System.in);

	MemberClass m = new MemberClass();
	m.setId("KHY");
	m.setPwd("0311");
	m.setAddress("Seoul");
	m.setPhoneNumber("010-3242-3850");
	m.setAge("25");

	map.put(id, m);
	map1.put(id, pwd);
	
	public void showManagerView() {
		
		System.out.println("���Ͻô� �۾��� ���ؼ� ��ȣ�� �Է����ּ���(1.ȸ���˻�, 2.ȸ�����, 3.ȸ������, 4.ȸ������, 5.����)");
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
			
		}
	}
	
	public void showClientView() {
		
		
	}
	

	
	
	public void searchUser() {
		System.out.println("ȸ�� ������ Ȯ���ϱ� ���� ���̵�� ��й�ȣ�� �Է����ּ���.");
		System.out.print("���̵� : ");
		id = scanner.next();
		System.out.print("��й�ȣ : ");
		pwd = scanner.next();
		password = map1.get(id);

		if (pwd.equals(map1.get(id))) {
			userdata = map.get(id);

			System.out.println("-------------ȸ�� ����-------------");
			System.out.println("���̵� : " + userdata.getId());
			System.out.println("��й�ȣ : " + userdata.getPwd());
			System.out.println("�ּ� : " + userdata.getAddress());
			System.out.println("�ڵ��� ��ȣ : " + userdata.getPhoneNumber());
			System.out.println("���� : " + userdata.getAge());
			System.out.println("---------------------------------\n\n");

			if (userdata.isManager()) {
				showManagerView();
			}
			else {
				showClientView();
			}
			
		} else {
			System.out.println("##### ���̵�� ��й�ȣ�� Ȯ�����ּ��� #####\n\n");
		}

	}


	public void joinMembership() {
		System.out.println("ȸ������� ���� ������ ������ �Է����ּ���.");
		System.out.print"���̵� : ");
		id = scanner.next();
		if (!map1.containsKey(id)) {
			System.out.print("��й�ȣ : ");
			pwd = scanner.next();
			System.out.print("�ּ� : ");
			addr = scanner.next();
			System.out.print("�ڵ��� ��ȣ : ");
			phoneNumber = scanner.next();
			System.out.print("���� : ");
			age = scanner.next();

			MemberClass m = new MemberClass();
			m.setId(id);
			m.setPwd(pwd);
			m.setAddress(addr);
			m.setPhoneNumber(phoneNumber);
			m.setAge(age);

			map.put(id, m);
			map1.put(id, pwd);
			System.out.println("##### ȸ�� ����� �Ϸ�Ǿ����ϴ� #####\n\n");
		} else {
			System.out.println("##### �ߺ��Ǵ� ���̵� �ֽ��ϴ�. ���̵� �ٽ� �Է����ּ��� #####\n\n");
		}
	}

	public void modifyUser() {
		String id1;
		System.out.println("ȸ�� ������ �����ϱ� ���� ���̵�� ��й�ȣ�� �Է����ּ���.");
		System.out.print("���̵� : ");
		id = scanner.next();
		System.out.print("��й�ȣ : ");
		pwd = scanner.next();

		if (pwd.equals(map1.get(id))) {
			userdata = map.get(id);
	
			System.out.print("���̵� : ");
			id1 = scanner.next();
			System.out.print("��й�ȣ : ");
			pwd = scanner.next();
			System.out.print("�ּ� : ");
			addr = scanner.next();
			System.out.print("�ڵ��� ��ȣ : ");
			phoneNumber = scanner.next();
			System.out.print("���� : ");
			age = scanner.next();
	
			userdata.setId(id1);
			userdata.setPwd(pwd);
			userdata.setAddress(addr);
			userdata.setPhoneNumber(phoneNumber);
			userdata.setAge(age);
	
			map.put(id1, userdata);
			map1.put(id1, pwd);
			map.remove(id);
			map1.remove(id);
			System.out.println("##### ȸ�� ������ �����Ǿ����ϴ� #####\n\n");
		}else {
			System.out.println("##### ���̵�� ��й�ȣ�� ��Ȯ�ϰ� �Է����ּ��� #####\n\n");
		}
	}



	public void deleteUser() {
		System.out.println("ȸ�� ������ �����ϱ� ���� ���̵� �Է����ּ���.");
		System.out.print("���̵� : ");
		id = scanner.next();
		map.remove(id);
		map1.remove(id);
		System.out.println("##### ȸ�� ������ �����Ǿ����ϴ� #####\n\n");
	}

	public void systemOut() {
		System.out.println("ȸ������ �ý����� �����մϴ�.");
	}

}

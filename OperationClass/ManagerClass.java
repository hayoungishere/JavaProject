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
		
		System.out.println("원하시는 작업을 위해서 번호를 입력해주세요(1.회원검색, 2.회원등록, 3.회원수정, 4.회원삭제, 5.종료)");
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
			
		}
	}
	
	public void showClientView() {
		
		
	}
	

	
	
	public void searchUser() {
		System.out.println("회원 정보를 확인하기 위해 아이디와 비밀번호를 입력해주세요.");
		System.out.print("아이디 : ");
		id = scanner.next();
		System.out.print("비밀번호 : ");
		pwd = scanner.next();
		password = map1.get(id);

		if (pwd.equals(map1.get(id))) {
			userdata = map.get(id);

			System.out.println("-------------회원 정보-------------");
			System.out.println("아이디 : " + userdata.getId());
			System.out.println("비밀번호 : " + userdata.getPwd());
			System.out.println("주소 : " + userdata.getAddress());
			System.out.println("핸드폰 번호 : " + userdata.getPhoneNumber());
			System.out.println("나이 : " + userdata.getAge());
			System.out.println("---------------------------------\n\n");

			if (userdata.isManager()) {
				showManagerView();
			}
			else {
				showClientView();
			}
			
		} else {
			System.out.println("##### 아이디와 비밀번호를 확인해주세요 #####\n\n");
		}

	}


	public void joinMembership() {
		System.out.println("회원등록을 위해 다음의 정보를 입력해주세요.");
		System.out.print"아이디 : ");
		id = scanner.next();
		if (!map1.containsKey(id)) {
			System.out.print("비밀번호 : ");
			pwd = scanner.next();
			System.out.print("주소 : ");
			addr = scanner.next();
			System.out.print("핸드폰 번호 : ");
			phoneNumber = scanner.next();
			System.out.print("나이 : ");
			age = scanner.next();

			MemberClass m = new MemberClass();
			m.setId(id);
			m.setPwd(pwd);
			m.setAddress(addr);
			m.setPhoneNumber(phoneNumber);
			m.setAge(age);

			map.put(id, m);
			map1.put(id, pwd);
			System.out.println("##### 회원 등록이 완료되었습니다 #####\n\n");
		} else {
			System.out.println("##### 중복되는 아이디가 있습니다. 아이디를 다시 입력해주세요 #####\n\n");
		}
	}

	public void modifyUser() {
		String id1;
		System.out.println("회원 정보를 수정하기 위해 아이디와 비밀번호를 입력해주세요.");
		System.out.print("아이디 : ");
		id = scanner.next();
		System.out.print("비밀번호 : ");
		pwd = scanner.next();

		if (pwd.equals(map1.get(id))) {
			userdata = map.get(id);
	
			System.out.print("아이디 : ");
			id1 = scanner.next();
			System.out.print("비밀번호 : ");
			pwd = scanner.next();
			System.out.print("주소 : ");
			addr = scanner.next();
			System.out.print("핸드폰 번호 : ");
			phoneNumber = scanner.next();
			System.out.print("나이 : ");
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
			System.out.println("##### 회원 정보가 수정되었습니다 #####\n\n");
		}else {
			System.out.println("##### 아이디와 비밀번호를 정확하게 입력해주세요 #####\n\n");
		}
	}



	public void deleteUser() {
		System.out.println("회원 정보를 삭제하기 위해 아이디를 입력해주세요.");
		System.out.print("아이디 : ");
		id = scanner.next();
		map.remove(id);
		map1.remove(id);
		System.out.println("##### 회원 정보가 삭제되었습니다 #####\n\n");
	}

	public void systemOut() {
		System.out.println("회원관리 시스템을 종료합니다.");
	}

}

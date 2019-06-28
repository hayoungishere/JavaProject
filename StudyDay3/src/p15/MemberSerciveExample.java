package p15;

public class MemberSerciveExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		MemberService ms = new MemberService();
		
		boolean result= ms.login("hong", "12345");
		if(result) {
			System.out.println("로그인 되었습니다.");
			ms.logout("hong");
		}else {
			System.out.println("id 또는 password 가 일치하지 않습니다.");
		}
	}

}

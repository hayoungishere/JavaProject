package p15;

public class MemberSerciveExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		MemberService ms = new MemberService();
		
		boolean result= ms.login("hong", "12345");
		if(result) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			ms.logout("hong");
		}else {
			System.out.println("id �Ǵ� password �� ��ġ���� �ʽ��ϴ�.");
		}
	}

}

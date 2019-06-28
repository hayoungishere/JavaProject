package p15;

public class MemberService {
	
	private String id="hong";
	private String password="12345";
	
	public boolean login(String id, String password) {
		boolean res;
		if(this.id==id && this.password==password) {
			res=true;
		}else {
			res=false;
		}
		return res;
	}
	
	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
	
	
}

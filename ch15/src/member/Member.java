package member;

public class Member {

	private String id;
	private String pwd;
	private String address;
	private String PhoneNumber;
	private String age;
	
	public Member() {
		//default constructor...
	}
	
	public Member(String id, String pwd, String address, String phoneNumber, String age) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.address = address;
		PhoneNumber = phoneNumber;
		this.age = age;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	
	
}

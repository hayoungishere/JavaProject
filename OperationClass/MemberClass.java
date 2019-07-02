package member;

public class MemberClass {

	private String id;
	private String pwd;
	private String address;
	private String phoneNumber;
	private String age;
	private boolean manager;
	
	public MemberClass() {}
	public MemberClass(String id, String pwd, String address, String phoneNumber, String age, boolean manager) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.age = age;
		this.manager=manager;
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
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public void setManager(boolean manager) {
		this.manager=manager;
	}
	public boolean isManager() {
		return this.manager;
	}
	
}

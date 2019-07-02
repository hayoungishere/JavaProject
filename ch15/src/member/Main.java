package member;

import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Member> memberList = new ArrayList<Member>();
		
		Member m1 = new Member();
		m1.setId("KHY");
		m1.setPwd("123");
		m1.setAddress("»≠∞Óµø");
		m1.setAge("25");
		m1.setPhoneNumber("010-1234-1234");
		
		memberList.add(m1);
		
		
		Member m2 = new Member();
		m2.setId("YYM");
		m2.setPwd("456");
		m2.setAddress("»≠∞Óµø");
		m2.setAge("10");
		m2.setPhoneNumber("010-5678-5678");
		
		memberList.add(m2);
		
		
		Member m3 = new Member();
		m3.setId("KHN");
		m3.setPwd("2020");
		m3.setAddress("øÏ¿ÂªÍ");
		m3.setAge("20");
		m3.setPhoneNumber("010-2020-2020");
		
		memberList.add(m3);
	
		
		for(Member m : memberList) {
			System.out.println("############################");
			System.out.println(m.getId());
			System.out.println(m.getPhoneNumber());
			System.out.println(m.getPwd());
			System.out.println(m.getAge());
			System.out.println(m.getAddress());
		}
		
	}

}

package string;

import java.util.StringTokenizer;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "A Java Program";
		char c = s.charAt(5);
		
		System.out.println(c);
		
		String ssn = "012345-112345";
		if(ssn.charAt(8)=='1'){
			System.out.println("�����̴�.");
		}else {
			System.out.println("�����̴�.");
		}
	
	System.out.println(s.indexOf("Java"));
	
	if(s.indexOf("Java") != -1) {
		//���ڿ��� "Java"�� ���ԵǾ� �ִ�.
		System.out.println("���ڿ��� 'Java'�� ���ԵǾ� �ִ�. ");
	}else {
		System.out.println("���ڿ��� 'Java'�� ���ԵǾ� ���� �ʴ�.");
	}
	
	
	if(s.contains("Java")) {
		System.out.println("Contains function returns true");
	}else {
		System.out.println("Contains function returns false");
	}
	
	String s11= "��,��,��";
	StringTokenizer st = new StringTokenizer(s11,",");
	System.out.println(st.countTokens());
	
	for(int k=0; k<st.countTokens(); k++) {
		System.out.println("k : "+k);
	}

	while(st.hasMoreTokens()) {
		String token = st.nextToken();
		System.out.println(token);
	}
	
	
	
	
	
	
	
	
	
	
	}
}
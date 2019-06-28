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
			System.out.println("남성이다.");
		}else {
			System.out.println("여성이다.");
		}
	
	System.out.println(s.indexOf("Java"));
	
	if(s.indexOf("Java") != -1) {
		//문자열에 "Java"가 포함되어 있다.
		System.out.println("문자열에 'Java'가 포함되어 있다. ");
	}else {
		System.out.println("문자열에 'Java'가 포함되어 있지 않다.");
	}
	
	
	if(s.contains("Java")) {
		System.out.println("Contains function returns true");
	}else {
		System.out.println("Contains function returns false");
	}
	
	String s11= "가,나,다";
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
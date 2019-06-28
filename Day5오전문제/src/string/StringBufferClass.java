package string;

public class StringBufferClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("abc");
		
		System.out.println(sb.toString());
	
		StringBuffer sb1 = new StringBuffer("def");
		System.out.println(sb1);
		
		System.out.println(sb.append(sb1));
		System.out.println(sb.length());
		
		sb.insert(3,"123");
		System.out.println(sb.toString());
	
		sb.delete(3, 6);  // delete(startIndex, endIndex)
		System.out.println(sb.toString());
		
		
		
		
		
	}

}

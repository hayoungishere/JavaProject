package substream;

import java.io.*;

public class BufferedMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InputStream is = null;
		BufferedInputStream bis = null;
		
		try {
			
			is = new FileInputStream("D:\\JavaProject\\file\\test_text.txt");
			bis = new BufferedInputStream(is);
			
			int readInt;
			byte[] data = new byte[100];
			
			while((readInt=bis.read(data)) != -1) {
				String s = new String(data, 0, readInt); //readInt => byte에서 읽어온 문자열의 길이
				System.out.println(s);
				
			}
			
			
			
		}catch(Exception e){
			
		}
		
		
		
		
	
		
		
		
		
		
		
		
	}

}

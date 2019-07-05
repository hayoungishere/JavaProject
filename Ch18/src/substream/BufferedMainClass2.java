package substream;

import java.io.*;

public class BufferedMainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InputStream is = null;
		InputStreamReader isr=null;
		BufferedReader br = null;
		
		try {
			is = new FileInputStream("D:\\JavaProject\\file\\test_text.txt");
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			String readLine;
			while((readLine = br.readLine()) != null) {
				System.out.println(readLine);
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		
		
		
		
		
	}

}

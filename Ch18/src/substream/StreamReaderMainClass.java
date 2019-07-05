package substream;

import java.io.*;

public class StreamReaderMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InputStream is = null;
		OutputStream os = null;
		InputStreamReader isr = null;
		OutputStreamWriter osw = null;
		
		try {
			is = new FileInputStream("D:\\JavaProject\\file\\test_text.txt");
			os = new FileOutputStream("D:\\JavaProject\\file\\output.txt");
	
			
			try {
				isr = new InputStreamReader(is,"UTF-8");
				osw = new OutputStreamWriter(os, "euc-kr");
				
				
				int readInt;
				char[] data= new char[100];
				
				try {
					// print file 
					while((readInt = isr.read(data)) != -1) {
					//	System.out.println((char)readInt);
					String s  = new String(data, 0, readInt);
					System.out.println(s);
					osw.write(data,0,readInt);
					}
					
					osw.flush();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}			
				
			} catch (UnsupportedEncodingException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			try {
				//file close.
				
				if(isr != null) isr.close();
				if(osw != null) osw.close();
				
				
				is.close();
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

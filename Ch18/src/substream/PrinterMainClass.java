package substream;
import java.io.*;
public class PrinterMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OutputStream os = null;
		PrintStream ps = null;
		
		try {
			
			os= new FileOutputStream("D:\\\\JavaProject\\\\file\\\\output.txt");
			ps = new PrintStream(os);
		
			// ���� ����Ⱑ �����.
			ps.print("������");
			ps.println("1234");
			
			ps.flush(); //�޸𸮿� �ݿ�.
			
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if(ps != null) ps.close();
			
				try {
					os.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		} 
		
		
	}

}

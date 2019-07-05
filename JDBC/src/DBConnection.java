import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Connection conn=null;
		String driver  ="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "bigdata";
		String pwd = "bigdata";
		
		
		try {
			Class.forName(driver); // 클래스 동적할당0
			try {
				conn= DriverManager.getConnection(url, user, pwd);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Connection Fail");
				
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Oracle driver Not found Exception");
		}
		
		System.out.println("Oracle 연결이 완료 되었습니다.");
		
	}

}

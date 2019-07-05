package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import vo.User_tblVO;

public class User_tblDAO {
//Data Access Object
	
	private Connection getConnection() {
		// Database에 연결하는 함수
		// 연결된 객체를 반환한다.
		
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
		
		return conn;
	}
	
	public List<User_tblVO> selectAlluser(){
		// 실행문
		// select * from user_tbl;
		Connection conn = null; //나중에 close 필요, DB connector
		Statement stmt = null; // 나중에 close 필요 , Querying to DB
		ResultSet rs = null; // 나중에 close 필요, result of query
		
		List<User_tblVO> list = null;
		
		try {
			list = new ArrayList<User_tblVO>();
			conn = getConnection();
			String sql = "select * from user_tbl";
			stmt = conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			while(rs.next()) {
				User_tblVO vo = new User_tblVO();

				vo.setId(rs.getString("id"));
				vo.setPwd(rs.getString("pwd"));
				vo.setEmail(rs.getString("email"));
				list.add(vo);
			}
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} // end of finally
		
		return list;
	}
	
	
	public User_tblVO selectOne(String id) {
			Connection conn = null;
		//	Statement stmt = null;
			PreparedStatement pstmt = null;
			
			ResultSet rs = null;
			User_tblVO vo = null;
			
			try {
				conn = getConnection();
				String sql = "select * from user_tbl where id=?";
				//stmt = conn.createStatement();
				//rs=stmt.executeQuery(sql);
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, id);
				rs=pstmt.executeQuery();
				
				while(rs.next()) {
					vo= new User_tblVO();
					vo.setId(rs.getString("id"));
					vo.setPwd(rs.getString("pwd"));
					vo.setEmail(rs.getString("Email"));
				}
				
				
				
			} catch (Exception e) {
				// TODO: handle exception
			}finally {
				
					try {
						if(conn != null) conn.close();
						if(pstmt != null ) pstmt.close();
						if(rs != null) rs.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}// end of finally
			
		
		
		return vo;
	}
	
	public int insert(User_tblVO vo) {
		
		Connection conn =null;
		PreparedStatement pstmt = null;
		int res=0;
		
		try {
			
			conn = getConnection();
			String sql = "insert into user_tbl(id, pwd, email) values(?,?,?)";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, vo.getId());
			pstmt.setString(2,  vo.getPwd());
			pstmt.setString(3, vo.getEmail());
			
			res=pstmt.executeUpdate(); // insert, update, delete는 executeUpdate를 사용해서 쿼리를 보내야된다.
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
				try {
					if(pstmt != null) pstmt.close();
					if(conn != null) conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		
		
		return res;
	}
	public int update(User_tblVO vo) {
		int res=0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = getConnection();
			String sql = "update user_tbl set pwd=?, email=? where id=? ";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, vo.getPwd());
			pstmt.setString(2,  vo.getEmail());
			pstmt.setString(3, vo.getId());
			
			res=pstmt.executeUpdate(); // insert, update, delete는 executeUpdate를 사용해서 쿼리를 보내야된다.			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return res;
	}
	
	public int delete(String id) {
		int res=0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = getConnection();
			String sql = "delete from user_tbl where id=? ";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, id);
			
			res=pstmt.executeUpdate(); // insert, update, delete는 executeUpdate를 사용해서 쿼리를 보내야된다.			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return res;
	}
	
	
	
}






















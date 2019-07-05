package dao;

import java.util.*;
import java.sql.*;
import vo.*;

import vo.MemberVo;

public class MemberDao implements MemberDaoImpl{
	int count=0;

	public Connection getConnection() {
		Connection conn=null;
		
		try {
			//mysql driver => com.mysql.jdbc.Driver
			//mysql url => jdbc:mysql:127.0.0.1:3306/DataBase
			
			String oracleDriver="oracle.jdbc.driver.OracleDriver";
			String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String id="bigdata";
			String pwd= "bigdata";
			
			Class.forName(oracleDriver);
			conn = DriverManager.getConnection(url, id, pwd);
		//	System.out.println("Success Db Connection!!");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			//System.out.println("Error :: DB Connection..");
		
		}finally {
			
		}
		
		return conn;
		
	}
	
	@Override
	public int insert(MemberVo vo) {
		// TODO Auto-generated method stub
		int res=0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = getConnection();
			String sql = "insert into member_tbl(no,id, pwd, address, phoneNumber, age) values(SEQ_NUMBER.NEXTVAL,?,?,?,?,?)"; // db에서 sequence를 생성하면 자동으로 값을 증가 시킨다.
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1,vo.getId());
			pstmt.setString(2,  vo.getPwd());
			pstmt.setString(3, vo.getAddress());
			pstmt.setString(4, vo.getPhoneNumber());
			pstmt.setString(5, vo.getAge());
			
			res=pstmt.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
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

	@Override
	public List<MemberVo> selectAll(){
		// TODO Auto-generated method stub

		Connection conn =null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<MemberVo> mList = new ArrayList<MemberVo>();
		try {
			conn=getConnection();
			String sql = "select * from member_tbl";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			
			while(rs.next()) {
				MemberVo mvo = new MemberVo();
				mvo.setNo(rs.getInt("no"));
				mvo.setId(rs.getString("id"));
				mvo.setPwd(rs.getString("pwd"));
				mvo.setAddress(rs.getString("address"));
				mvo.setPhoneNumber(rs.getString("phoneNumber"));
				mvo.setAge(rs.getString("age"));
				mList.add(mvo);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			close(conn,rs,pstmt);
		}
		
		
		return mList;
	}

	@Override
	public MemberVo selectOne(MemberVo vo) {
		// No 번호를 통해 멤버 정보 가져오는 함수
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MemberVo mvo = null;
		
		try {
			conn = getConnection();
			String sql = "select * from member_tbl where no=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getNo());
		
			rs= pstmt.executeQuery();
			
			while(rs.next()) {
				if(rs!=null) {
					mvo =new MemberVo();
					mvo.setNo(rs.getInt(1));
					mvo.setId(rs.getString(2));
					mvo.setPwd(rs.getString(3));
					mvo.setAddress(rs.getString(4));
					mvo.setPhoneNumber(rs.getString(5));
					mvo.setAge(rs.getString(6));
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			close(conn, rs, pstmt);
		}
		
		return mvo;
	}

	@Override
	public int update(MemberVo vo) {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		int rs =0;
		
		try {
			conn = getConnection();
			String sql = "update member_tbl set pwd=?, address=?, phoneNumber=?, age=? where id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getPwd());
			pstmt.setString(2, vo.getAddress());
			pstmt.setString(3,  vo.getPhoneNumber());
			pstmt.setString(4,  vo.getAge());
			pstmt.setString(5, vo.getId());
			
			
			
			rs= pstmt.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			close(conn, pstmt);
		}
		
		
		return rs;
	}

	@Override
	public int delete(MemberVo vo) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstmt = null;
		int rs =0;
		
		try {
			conn = getConnection();
			String sql = "delete from member_tbl where id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getId());
			
			
			rs= pstmt.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			close(conn, pstmt);
		}
		
		
		return rs;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MemberVo mvo =null;
		
		try {
			conn = getConnection();
			String sql = "select count(*) from member_tbl";
			pstmt = conn.prepareStatement(sql);
			
			rs= pstmt.executeQuery();
			
			while(rs.next()) {
				count=rs.getInt(1);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			close(conn, rs, pstmt);
		}
		
		System.out.println(count);
		return count;
	}
	
	public void close(Connection conn, ResultSet rs, PreparedStatement pstmt) {
		try {
			if(conn != null) conn.close();
			if(rs != null )rs.close();
			if(pstmt != null) pstmt.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	//Overloading
	public void close(Connection conn, PreparedStatement pstmt) {
		try {
			if(conn != null) conn.close();
			if(pstmt != null) pstmt.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public int selectID(MemberVo vo) {
		// No 번호를 통해 멤버 정보 가져오는 함수
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int result=0;
		try {
			conn = getConnection();
			String sql = "select count(*) from member_tbl where id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getId());
		
			rs= pstmt.executeQuery();
			
			while(rs.next()) {
				result=rs.getInt(1);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			close(conn, rs, pstmt);
		}
		
		return result;
	}

	
	
}

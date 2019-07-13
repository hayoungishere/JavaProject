package com.bigdata.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.*;

import com.bigdata.vo.Web_memberVO;
import com.bigdata.*;
public class Web_memberDAO implements Web_memberDAOImpl{

	
	//singleton pattern 적용.
	private static Web_memberDAO dao;
	
	private Web_memberDAO() {
		//initial constructor
	}
	public static Web_memberDAO getMemberDAO() {
		if(dao==null) {
			dao=new Web_memberDAO();
		}
		return dao;
	}
	
	
	private Connection getConnection(){
		Connection conn = null;
		String url  ="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String driver ="oracle.jdbc.driver.OracleDriver";
		String id="bigdata";
		String pwd="bigdata";
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url, id, pwd);
	
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block	
			System.out.println("드리이브 로드 실패");
			e.printStackTrace();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("DB Connection Fail");
			e.printStackTrace();
		}
		
		return conn;
	}

	@Override
	public List<Web_memberVO> selectAll() {
		// TODO Auto-generated method stub
		Connection conn= null;
		PreparedStatement pstmt = null;
		ResultSet rs= null;
		List<Web_memberVO> wmlist = null;
		try {
			wmlist = new ArrayList<Web_memberVO>();
			conn =getConnection();
			String sql = "SELECT *"
						+ "FROM Web_member";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				Web_memberVO member= new Web_memberVO();
				member.setNo(rs.getInt("no"));
				member.setId(rs.getString("id"));
				member.setPwd(rs.getString("pwd"));
				member.setName(rs.getString("name"));
				member.setAddress(rs.getString("address"));
				member.setPhone_number(rs.getString("phone_number"));
				member.setAge(rs.getInt("age"));
				member.setJoin_dt(rs.getDate("join_dt"));
				member.setAdmin_yn(rs.getString("admin_yn"));
				
				wmlist.add(member);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		 
		
		return wmlist;
	}

	@Override
	public Web_memberVO select(int no) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Web_memberVO select(String id) {
		// TODO Auto-generated method stub

		Connection conn= null;
		PreparedStatement pstmt = null;
		ResultSet rs= null;
		Web_memberVO searchedMember = null;
		try {
			conn =getConnection();
			String sql = "SELECT *"
						+ " FROM Web_member"
						+ " WHERE id=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			System.out.println(pstmt);
System.out.println(sql);
			rs=pstmt.executeQuery();
			

			while(rs.next()) {
				searchedMember=new Web_memberVO();
				searchedMember.setNo(rs.getInt("no"));
				searchedMember.setId(rs.getString("id"));
				searchedMember.setPwd(rs.getString("pwd"));
				searchedMember.setName(rs.getString("name"));
				searchedMember.setAddress(rs.getString("address"));
				searchedMember.setPhone_number(rs.getString("phone_number"));
				searchedMember.setAge(rs.getInt("age"));
				searchedMember.setJoin_dt(rs.getDate("join_dt"));
				searchedMember.setAdmin_yn(rs.getString("admin_yn"));
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		 
		
		return searchedMember;
	}

	@Override
	public int insert(Web_memberVO member) {
		// TODO Auto-generated method stub
		
		int res=0;
		/*if(select(member.getId())!= null) {
			//step1. select(String id) 를 호출해서 추가할 아이디가 이미 존재하는지 확인하기

			res=1;
		}
		else { */
		//step2. 1번스텝을 통과 했다면 DB에 추가
			Connection conn = null;
			PreparedStatement pstmt = null;
			
			try {
				conn=getConnection();
				String sql = "insert into web_member(id, pwd, name,address,phone_number,age,join_dt,admin_yn) values(?,?,?,?,?,?, sysdate, ?)";
				pstmt=conn.prepareStatement(sql);
				
				pstmt.setString(1, member.getId());
				pstmt.setString(2, member.getPwd());
				pstmt.setString(3, member.getName());
				pstmt.setString(4,member.getAddress());
				pstmt.setString(5, member.getPhone_number());
				pstmt.setInt(6, member.getAge());
				pstmt.setString(7,member.getAdmin_yn());
				
				res=pstmt.executeUpdate();
				System.out.println(pstmt);

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("이 아이디는 사용할 수 없습니다.");

				e.printStackTrace();
			}finally {

				try {
					if(pstmt!= null) pstmt.close();
					if(conn != null) conn.close();
					
				} catch (Exception e2) {
					// TODO: handle exception
					
					e2.printStackTrace();
				}
			}
		//}//end of else
	
		return res;
	}

	@Override
	public int update(Web_memberVO member) {
		// TODO Auto-generated method stub
		int res=0;
		/*if(select(member.getId())!= null) {
			//step1. select(String id) 를 호출해서 추가할 아이디가 이미 존재하는지 확인하기

			res=1;
		}
		else { */
		//step2. 1번스텝을 통과 했다면 DB에 추가
			Connection conn = null;
			PreparedStatement pstmt = null;
			
			try {
				conn=getConnection();
				String sql = "update web_member set pwd=?, name=?, address=?, phone_number=?, age=?, admin_yn=? where id=?";
				pstmt=conn.prepareStatement(sql);
				
				pstmt.setString(1, member.getPwd());
				pstmt.setString(2, member.getName());
				pstmt.setString(3, member.getAddress());
				pstmt.setString(4,member.getPhone_number());
				pstmt.setInt(5, member.getAge());
				pstmt.setString(6,member.getAdmin_yn());
				pstmt.setString(7,  member.getId());
				
				res=pstmt.executeUpdate();
				System.out.println(pstmt);

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("오류 발생 !!");

				e.printStackTrace();
			}finally {

				try {
					if(pstmt!= null) pstmt.close();
					if(conn != null) conn.close();
					
				} catch (Exception e2) {
					// TODO: handle exception
					
					e2.printStackTrace();
				}
			}
		//}//end of else
	
		return res;
	}

	@Override
	public int delete(Web_memberVO member) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub

		int res=0;
	
		//step1 DB에서 삭제
			Connection conn = null;
			PreparedStatement pstmt = null;
			
			try {
				conn=getConnection();
				String sql = "delete from web_member where id=?";
				pstmt=conn.prepareStatement(sql);
				
				pstmt.setString(1, id);
				
				res=pstmt.executeUpdate();
				System.out.println(pstmt);

			} catch (Exception e) {
				// TODO: handle exception

				e.printStackTrace();
			}finally {

				try {
					if(pstmt!= null) pstmt.close();
					if(conn != null) conn.close();
					
				} catch (Exception e2) {
					// TODO: handle exception
					
					e2.printStackTrace();
				}
			}
	
		return res;
	}
	
	
	
	
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		int size=0;
		
		Connection conn= null;
		PreparedStatement pstmt = null;
		ResultSet rs= null;
		try {
			conn =getConnection();
			String sql = "SELECT count(*) as count"
						+ "FROM Web_member";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				size=rs.getInt("count");
							}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return size;
	}
	


}

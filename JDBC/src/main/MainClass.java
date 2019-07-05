package main;

import java.util.ArrayList;
import java.util.List;

import dao.User_tblDAO;
import vo.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User_tblDAO dao = new User_tblDAO(); 
		
		List<User_tblVO> list = new ArrayList<User_tblVO>();
		list=dao.selectAlluser();
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getId());
			System.out.println(list.get(i).getPwd());
			System.out.println(list.get(i).getEmail());

		}
	
		
		System.out.println("\n"+"<< Select One test>>");
		User_tblVO user = new User_tblVO();
		user=dao.selectOne("khy");
		System.out.println(user.getId());
		System.out.println(user.getPwd());
		System.out.println(user.getEmail());
	
		System.out.println("\n"+"<< Insert One test>>");

		User_tblVO insertVO = new User_tblVO();
		insertVO.setId("khn");
		insertVO.setPwd("214");
		insertVO.setEmail("khn@naver.com");
	
		/*if(dao.insert(insertVO) ==1 ) {
			System.out.println("성공적으로 데이터베이스에 적용되었습니다.");
		}else {
			System.out.println("데이터베이스 저장에 실패했습니다.");
		}*/
		
		System.out.println("\n"+"<< update One test>>");

		User_tblVO updateVO = new User_tblVO();
		updateVO.setId("khn");
		updateVO.setPwd("214");
		updateVO.setEmail("khn214@naver.com");
	
		if(dao.update(updateVO) ==1 ) {
			System.out.println("성공적으로 데이터베이스에 적용되었습니다.");
		}else {
			System.out.println("데이터베이스 저장에 실패했습니다.");
		}
		
		
		
		
		System.out.println("\n"+"<< Delete One test>>");
		String deleteId= "khn";
		if(dao.delete(deleteId) ==1 ) {
			System.out.println("Success Delete!!");
		}else {
			System.out.println("Fail delete....");
		}
		
		
	}

}

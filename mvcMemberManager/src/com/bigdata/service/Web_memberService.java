package com.bigdata.service;


import java.util.List;

import com.bigdata.dao.Web_memberDAO;
import com.bigdata.vo.Web_memberVO;

public class Web_memberService implements Web_memberServiceImpl {

	@Override
	public List<Web_memberVO> selectWeb_members() {
		// TODO Auto-generated method stub
		
		Web_memberDAO dao=Web_memberDAO.getMemberDAO();
		
		return dao.selectAll();
	}

	@Override
	public Web_memberVO selectWeb_member(int no) {
		// TODO Auto-generated method stub
		
		
		return null;
	}
	

	@Override
	public Web_memberVO selectWeb_member(String id) {
		// TODO Auto-generated method stub
		Web_memberDAO dao = Web_memberDAO.getMemberDAO();
		
		Web_memberVO res = dao.select(id);
		
		return res;
	}


	@Override
	public int regist_Web_member(Web_memberVO member) {
		// TODO Auto-generated method stub

		Web_memberDAO dao =Web_memberDAO.getMemberDAO();
		
		int res=dao.insert(member);
		
		return res;
	}

	@Override
	public int update_Web_member(Web_memberVO member) {
		// TODO Auto-generated method stub
		
		Web_memberDAO dao =Web_memberDAO.getMemberDAO();
		
		int res=dao.update(member);
		
		return res;
	}

	@Override
	public int delete_Web_member(Web_memberVO member) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete_Web_member(String id) {
		// TODO Auto-generated method stub
		
		Web_memberDAO dao =Web_memberDAO.getMemberDAO();
		
		int res=dao.delete(id);
		
		return res;
		
	}
}

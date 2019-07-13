package com.bigdata.service;

import java.util.List;

import com.bigdata.vo.*;
public interface Web_memberServiceImpl {

	public List<Web_memberVO> selectWeb_members();
	public Web_memberVO selectWeb_member(int no);
	public Web_memberVO selectWeb_member(String id);
	public int regist_Web_member(Web_memberVO member);
	public int update_Web_member(Web_memberVO member);
	public int delete_Web_member(Web_memberVO member);
	public int delete_Web_member(String id);
	
}

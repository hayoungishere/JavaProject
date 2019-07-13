package com.bigdata.dao;
import java.util.List;

import com.bigdata.vo.*;


public interface Web_memberDAOImpl {

	public List<Web_memberVO> selectAll();
	public Web_memberVO select(int no);
	public Web_memberVO select(String id);
	public int insert(Web_memberVO member);
	public int update(Web_memberVO member);
	public int delete(Web_memberVO member);
	public int delete(String id);

	public int getSize();
}

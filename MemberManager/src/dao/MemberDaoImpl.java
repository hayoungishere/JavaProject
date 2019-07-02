package dao;

import vo.MemberVo;

public interface MemberDaoImpl {
	public int insert(MemberVo m);
	public void selectAll();
	public MemberVo selectOne(int no);
	public int update(int no, MemberVo m);
	public int delete(int no);
	public int size();
}

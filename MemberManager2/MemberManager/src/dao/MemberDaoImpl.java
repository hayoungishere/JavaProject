package dao;

import vo.MemberVo;

public interface MemberDaoImpl {
	public int insert(MemberVo vo);
	public 	List<MemberVO> selectALL();
	public MemberVo selectOne(MemberVO vo);
	public int update(MemberVo vo);
	public int delete(MemberVo vo);
	public int count();

}

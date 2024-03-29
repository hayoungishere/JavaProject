package dao;

import java.util.List;

import vo.MemberVo;

public interface MemberDaoImpl {
	public int insert(MemberVo vo);
	public List<MemberVo> selectAll();
	public MemberVo selectOne(MemberVo vo);
	public int update(MemberVo vo);
	public int delete(MemberVo vo);
	public int count();
}

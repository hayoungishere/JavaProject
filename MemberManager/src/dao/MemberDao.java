package dao;

import java.util.*;

import vo.MemberVo;

public class MemberDao implements MemberDaoImpl{
	List<MemberVo> list = new ArrayList<MemberVo>();
	
	@Override
	public int insert(MemberVo m) {
		int size = size();
		list.add(m);
		if(list.size() > size) {
			return 1;
		}else {
			return 0;
		}
	}

	@Override
	public void selectAll() {
		// TODO Auto-generated method stub
		for(MemberVo m : list) {
			System.out.println(m.toString());
		}
	}

	@Override
	public MemberVo selectOne(int no) {
		for(int i =0 ;i< list.size(); i++) {
			if(list.get(i).getNo()==no) {
				return list.get(i);
			}
		}
		return null;
	}

	@Override
	public int update(int no, MemberVo m) {
		for(int i =0 ;i< list.size(); i++) {
			if(list.get(i).getNo()==no) {
				list.set(i,m);
				return 1;
			}
		}
		return 0;
	}

	@Override
	public int delete(int no) {
		for(int i =0 ;i< list.size(); i++) {
			if(list.get(i).getNo()==no) {
				list.remove(i);
				return 1;
			}
		}
		return 0;
	}

	@Override
	public int size() {
		return list.size();
	}

	
}

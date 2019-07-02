package service;

import java.util.Scanner;

import dao.*;
import vo.MemberVo;

public class MemberService implements MemberServiceImpl{
	MemberDaoImpl memberDao = new MemberDao();
	static int memberNo=1;
	@Override
	public int registMember() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		MemberVo vo = new MemberVo();
		memberDao.selectAll();
		System.out.println("===========회원등록===========");
		if(memberDao.size() == 0) {
			vo.setNo(1);
		}else {
			vo.setNo(++memberNo);
		}
		System.out.print("ID : ");
		vo.setId(sc.nextLine());
		System.out.print("PW : ");
		vo.setPwd(sc.nextLine());
		System.out.print("주소 : ");
		vo.setAddress(sc.nextLine());
		System.out.print("핸드폰번호 : ");
		vo.setPhoneNumber(sc.nextLine());
		System.out.print("나이 : ");
		vo.setAge(sc.nextLine());
		
		return memberDao.insert(vo);
		
	}

	@Override
	public void selectMembers() {
		// TODO Auto-generated method stub
		if(memberDao.size()==0) {
			System.out.println("회원이 존재하지 않습니다.");
			return;
		}
		System.out.println("=================전체회원정보==================");
		memberDao.selectAll();
		
	}

	@Override
	public void selectMember() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		if(memberDao.size()==0) {
			System.out.println("회원이 존재하지 않습니다.");
			return;
		}
		System.out.print("회원 번호를 선택하세요 : ");
		int memberNo = sc.nextInt();
		System.out.println("===============선택한회원정보===============");
		if(memberDao.selectOne(memberNo)!=null) {
			System.out.println(memberDao.selectOne(memberNo));
		}else {
			System.out.println("회원정보가 없습니다...");
		}
	}

	@Override
	public int updateMember() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		memberDao.selectAll();
		System.out.print("==>수정할 회원의 No를 선택하세요 : ");
		int memberNo =  sc.nextInt();
		MemberVo vo =  memberDao.selectOne(memberNo);
		vo.setNo(memberNo);
		vo.setId(vo.getId());
		vo.setPwd(vo.getPwd());
		sc.nextLine(); //엔터값 없애는 방법
		System.out.print("주소 : ");
		vo.setAddress(sc.nextLine());
		System.out.print("핸드폰번호 : ");
		vo.setPhoneNumber(sc.nextLine());
		System.out.print("나이 : ");
		vo.setAge(sc.nextLine());
		
		return memberDao.update(memberNo, vo);
	}

	@Override
	public int deleteMember() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		memberDao.selectAll();
		System.out.print("==>삭제할 회원의 No를 선택하세요 : ");
		int memberNo =  sc.nextInt();
		
		return memberDao.delete(memberNo);
	}
	
}

package service;

import java.util.List;
import java.util.Scanner;

import dao.*;
import vo.MemberVo;

public class MemberService implements MemberServiceImpl{
	MemberDao memberDao = new MemberDao();
	static int memberNo=1;
	@Override
	public void registMember() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		MemberVo vo = new MemberVo();
		memberDao.selectAll();
		System.out.println("===========회원등록===========");

		if(memberDao.count() == 0) {
			vo.setNo(1);
		}else {
			vo.setNo(++memberNo);
		}
		
		while(true) {
			System.out.print("ID : ");
			vo.setId(sc.nextLine());
			
			// Check ID duplicates...
			
			int check=memberDao.selectID(vo);
			if(check != 0) {
				System.out.println("이미 사용중인 id 입니다. 새로운 아이디를 입력해주세요.");
				continue;
			}
			
		
			System.out.print("PW : ");
			vo.setPwd(sc.nextLine());
			System.out.print("주소 : ");
			vo.setAddress(sc.nextLine());
			System.out.print("전화번호 : ");
			vo.setPhoneNumber(sc.nextLine());
			System.out.print("나이 : ");
			vo.setAge(sc.nextLine());
			
			int result= memberDao.insert(vo);
			if(result==1) {
				System.out.println("회원정보가 성공적으로 등록되었습니다.");
				break;
			}else {
				System.out.println("회원정보 등록에 실패하였습니다.");
				break;
			}
		}//end of while
		
		return;
	}

	@Override
	public void selectMembers() {
		// TODO Auto-generated method stub

		if(memberDao.count()==0) {
			System.out.println("회원이 존재하지 않습니다.");
			return;
		}
		
		System.out.println("================전체회원정보==================");
		List<MemberVo> mList = memberDao.selectAll();
				
		
		for(MemberVo mvo : mList) {
			System.out.println(mvo.toString());
		}
	}

	@Override
	public void selectMember() {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("회원번호를 입력하세요 ");
		int mNo = sc.nextInt();
		MemberVo mvo= new MemberVo();
		
		mvo.setNo(mNo);
		mvo=memberDao.selectOne(mvo);
		if(mvo != null)
			System.out.println(mvo.toString());
		else System.out.println("해당 회원의 정보가 존재하지 않습니다.");
	}

	@Override
	public void updateMember() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		MemberVo vo = new MemberVo();
		memberDao.selectAll();
		System.out.println("===========회원 정보 수정===========");

		if(memberDao.count() == 0) {
			vo.setNo(1);
		}else {
			vo.setNo(++memberNo);
		}
		
		while(true) {
			System.out.print("수정할 회원의 id를 입력해주세요 : ");
			vo.setId(sc.nextLine());
			
			// Check ID			
			int check=memberDao.selectID(vo);
			if(check == 0) {
				System.out.println("해당 id는 존재하지 않습니다. 다시 입력해주세요.");
				continue;
			}
			
		
			System.out.print("PW : ");
			vo.setPwd(sc.nextLine());
			System.out.print("주소 : ");
			vo.setAddress(sc.nextLine());
			System.out.print("전화번호 : ");
			vo.setPhoneNumber(sc.nextLine());
			System.out.print("나이 : ");
			vo.setAge(sc.nextLine());
			
			int result=memberDao.update(vo);
			if(result != 0 ) {
				System.out.println("DB에 성공적으로 반영되었습니다.");
				break;
			}else {
				System.out.println("DB 반영에 실패했습니다.");
				break;
			}
		}//end of while
		
		return;
	}

	@Override
	public void deleteMember() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		MemberVo vo = new MemberVo();
		memberDao.selectAll();
		System.out.println("===========회원 삭제===========");

		if(memberDao.count() == 0) {
			vo.setNo(1);
		}else {
			vo.setNo(++memberNo);
		}
		
		while(true) {
			System.out.print("삭제할 회원의 id를 입력해주세요 : ");
			vo.setId(sc.nextLine());
			
			// Check ID
			int check=memberDao.selectID(vo);
			if(check == 0) {
				System.out.println("해당 id는 존재하지 않습니다. 다시 입력해주세요.");
				continue;
			}
			
			int result=memberDao.delete(vo);
			if(result != 0 ) {
				System.out.println("회원삭제가 완료되었습니다.");
				break;
			}else {
				System.out.println("회원삭제가 완료되지 못했습니다. 오류를 확인해주세요.");
				break;
			}
		}//end of while
		
		
		
		return ;
	}
	
}

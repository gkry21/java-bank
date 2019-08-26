package com.bank.serviceimpls;

import com.bank.domains.CustomerBean;
import com.bank.domains.MemberBean;
import com.bank.services.MemberService;

public class MemberServiceImpl implements MemberService{
		private MemberBean[] members;
		private int count;
		
		public MemberServiceImpl() {
			members = new MemberBean[10];
		}
	@Override
	public void join(CustomerBean param) {
		members[count] = param;
		count++;
	}

	@Override
	public CustomerBean[] findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberBean[] findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberBean[] findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean login(MemberBean param) {
		for(int i=0;i<count;i++) {
			if(param.equals(members[i].getId()) &&
					param.equals(members[i].getPass())) {
				String msg = "로그인 성공";
			}
		}
		return false;
	}

	@Override
	public int countMembers() {  //
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existId(String id) {
		for(int i =0;i <= count ;i++) {	
			if(id.equals(members[i].getId())) {
				String msg = "이미 존재하는 아이디";
				break;}
		}
		return true;
	}

	@Override
	public void updatePass(MemberBean param) {
		String id = param.getId();
		String pass = param.getPass();
		String[] pws = pass.split(",");
		String oldPass = pws[0];
		String newPass = pws[1];
		for(int i=0; i< count; i++) {
			if(param.getId().equals(members[i].getId())
					&& param.getPass().equals(members[i].getPass())) {
				members[i].setPass(newPass);
			}
		}
		
	}

	@Override
	public void deleteMember(MemberBean param) {
		// TODO Auto-generated method stub
		
	}


}

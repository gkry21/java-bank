package com.bank.serviceimpls;

import com.bank.domains.*;
import com.bank.services.MemberService;

public class MemberServiceImpl implements MemberService{
		private MemberBean[] members;
		private int count;
		
		public MemberServiceImpl() {
				MemberBean members = new MemberBean();
				count = 0;
		}
		
	@Override
	public void join(CustomerBean param) {
		
		
	}

	@Override
	public CustomerBean[] findAllCustomers() {
		return null;
	}

	@Override
	public EmployeeBean[] findAllAdmins() {
		return null;
	}

	@Override
	public MemberBean[] findByName(String name) {
		return null;
	}

	@Override
	public MemberBean findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean login(MemberBean param) {
		return false;
	}

	@Override
	public int countCustomers() {
		return 0;
	}

	@Override
	public int countAdmins() {
		return 0;
	}

	@Override
	public boolean existId(String id) {
		return false;
	}

	@Override
	public void updatePass(MemberBean param) {
		
	}

	@Override
	public void deleteMember(MemberBean param) {
		
	}
	
}

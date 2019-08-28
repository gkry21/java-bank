               package com.bank.serviceimpls;

import com.bank.domains.*;
import com.bank.services.MemberService;

public class MemberServiceImpl implements MemberService{
		private CustomerBean[] cuss;
		private EmployeeBean[] emps;
		private int cuscount, empcount;
		
		public MemberServiceImpl() {
				 cuss = new CustomerBean[10];
				 emps = new EmployeeBean[10];
				cuscount = 0;
				empcount = 0;
		}
		
	@Override
	public void join(CustomerBean param) {  //하나씩 컨트롤러에 만들어서 비교 분석, 
			cuss[cuscount] = param;
			cuscount++;
	}
	@Override
	public void register(EmployeeBean param) {
		emps[empcount] = param;
		empcount++;
	}
	

	@Override
	public CustomerBean[] findAllCustomers() {
		return cuss;
	}

	@Override
	public EmployeeBean[] findAllMembers() {
		return emps;
	}

	@Override
	public MemberBean[] findByName(String name) { 
		int count1=0, count2=0, count3=0;
		for(int i=0;i<cuscount;i++) {
			if(name.equals(cuss[i].getName())) {
				count1++;
				break;
			}
		}
		for(int i= 0;i<empcount;i++) {
			if(name.equals(emps[i].getName())) {
				count2++;
				break;
			}
		}
		count3 = count1+count2;
		MemberBean[] members = new MemberBean[count3];
		int j =0;
		for(int i=0;i<count3;i++) {
			if(name.equals(cuss[i].getName())) {
				members[j] = cuss[i];
				j++;
				if(count1==j) {
					break;	
				}
			}
		}
		int k = 0;
		for(int i=0;i<count3;i++) {
			if(name.equals(emps[i].getName())) {
				members[k]=emps[i];
				k++;
				if(count2==k) {
					break;
				}
			}
		}
		return members;
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
	public int countEmployees() {
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

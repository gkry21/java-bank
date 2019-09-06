package com.bank.web.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import com.bank.web.daoimpl.MemberDAOImpl;
import com.bank.web.daos.MemberDAO;
import com.bank.web.domains.CustomerBean;
import com.bank.web.domains.EmployeeBean;
import com.bank.web.domains.MemberBean;
import com.bank.web.services.MemberService;

public class MemberServiceImpl implements MemberService{
	private List<CustomerBean> customers;
	private List<EmployeeBean> employees;
	private MemberDAO dao;
	
	public MemberServiceImpl() {
		customers = new ArrayList<>();
		employees = new ArrayList<>();
		dao = new MemberDAOImpl();
	}
	
	@Override
	public void join(CustomerBean param) {
		dao.insertCustomer(param);
	}

	@Override
	public void register(EmployeeBean param) {
		employees.add(param);
	}

	@Override
	public List<CustomerBean> findAllCustomers() {
		return customers;
	}

	@Override
	public List<EmployeeBean> findAllEmployees() {
		return employees;
	}

	@Override
	public List<MemberBean> findByName(String name) {
		List <MemberBean> m = new ArrayList<>();
		int count = 0;
		for(CustomerBean c : customers) {
			if(name.equals(c.getName())) {
				count++;
			}
				break;
			}
		for(EmployeeBean e : employees) {
			if(name.equals(e.getName())) {
				count++;
			}
				break;
			}
		int j = 0;
		for(CustomerBean c : customers) {
			if(name.equals(c.getName())) {
				m.add(c);
				j++;
				if(j==count) {
					return m;}
				}
			}
		for(EmployeeBean e : employees) {
			if(name.equals(e.getName())) {
				m.add(e); 
				j++;
				if(j==count) {
					break;
					}
		}
	}
		return m;
}
	
	@Override
	public MemberBean findById(String id) {
		MemberBean m = new MemberBean();
		for(CustomerBean c : customers) {
			if(id.equals(c.getId())) {
				m = c;
				return m;
			}
		}
			for(EmployeeBean e : employees) {
				if(id.equals(e.getId())) {
					m = e;
					break;
				}
		}
		return m;
}

	@Override
	public CustomerBean login(CustomerBean param) {
		return  dao.login(param);
		//인덱스 -> 회원가입 페이지로 이동 -> 회원가입 완료, 정보 저장-> 로그인 페이지 -> 성공여부< (서비스임플 작업, 로그인) ,성공 - 마이페이지 txt정보읽기, 리더, 실패,로그인 하나더 만들어서 실패페이지? 

	}
//		boolean flag = false;
//		MemberBean m =findById(param.getId());
//		for(CustomerBean c : customers) {
//			if(m.equals(c.getId())) {
//				flag = true;
//				break;
//			}
//		}
//			for(EmployeeBean e : employees) {
//				if(m.equals(e.getId())) {
//					flag = true;
//					break;
//				}
//			}
//		
//		return flag;
//	}

	@Override
	public int countCustomers() {
		return customers.size();
	}

	@Override
	public int countEmployees() {
		return employees.size();
	}

	@Override
	public boolean existId(String id) {
		boolean b = false;
		MemberBean m = findById(id);
		return (employees.contains(m) || customers.contains(m));
	}
 
	@Override
	public void updatePass(MemberBean param) {
		String id = param.getId();
		String oldPw = param.getPw().split(",")[0];
		String newPw = param.getPw().split(",")[1];
		MemberBean m = findById(id);
		int idx =(employees.contains(m)) 
				? employees.indexOf(m) 
						: customers.indexOf(m);	
			if(employees.contains(m)) {
				employees.get(idx);}
			else {}
			}

	@Override
	public boolean deleteMember(MemberBean param) {
		MemberBean m = findById(param.getId());
		return (employees.contains(m)) 
					? employees.remove(m) 
							: customers.remove(m);	
			}
	}
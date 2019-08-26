package com.bank.services;
import com.bank.domains.MemberBean;
import com.bank.domains.CustomerBean;;

public interface MemberService {
	// 1. 회원가입,,로그인,비밀번호변경,아이디존재   
	public void join(CustomerBean param); 
	public boolean login(MemberBean param);
	public boolean existId(String id);
	public void updatePass(MemberBean param);
	
	/*
	 * 관리자
	 * 1.고객리스트, 이름검색, 아이디검색,멤버카운트, 멤버 삭제
	 */
	public CustomerBean[] findAll();
	public MemberBean[] findByName(String name);
	public MemberBean[] findById(String id);
	public int countMembers();
	public void deleteMember(MemberBean param);
}

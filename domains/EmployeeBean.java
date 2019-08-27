package com.bank.domains;

public class EmployeeBean extends MemberBean {
	private String sabun;
	
	public void setSabun(String sabun) {
		this.sabun = sabun;
	}
	public String getSabun() {
		return sabun;
	}
	@Override
	public String toString() {
		return "사원번호 = " +sabun
				+ "[회원정보=" + getId() + 
				", 비번=" + getPass() + 
				", 이름=" + getName() + 
				", 주민번호=" + getSsn() + "]";
	}

}

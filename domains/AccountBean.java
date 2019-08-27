package com.bank.domains;
/*
 * 계좌번호, 거래일, 돈 accountNum, today, money
 */
public class AccountBean extends MemberBean{
	private String accountNum,today,money;

	
	public String getAccountNum() {
		return accountNum;
	}


	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}


	public String getToday() {
		return today;
	}


	public void setToday(String today) {
		this.today = today;
	}


	public String getMoney() {
		return money;
	}


	public void setMoney(String money) {
		this.money = money;
	}


	@Override
	public String toString() {
		return "계좌정보 [계좌번호=" + accountNum + 
								", 개설일=" + today + 
								", 금액=" + money + "]";
	}

}

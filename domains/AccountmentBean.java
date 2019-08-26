package com.bank.domains;
/*
 * 계좌번호, 거래일, 돈 accountNum, today, money
 */
public class AccountmentBean {
	private String accountNum,today,money;
	
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public String getAccountNum() {
		return accountNum;
	}
	public void setToday(String today) {
		this.today = today;
	}
	public String getToday() {
		return today;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	public String getMoney() {
		return money;
	}
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return String.format("");
		}
}

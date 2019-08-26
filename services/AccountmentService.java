package com.bank.services;
import com.bank.domains.AccountmentBean;

public interface AccountmentService {

	public void createAccount(int money);
	public String createAccountNum();
	//계좌번호 생성(1234-5678) 랜덤숫자 발생
	public AccountmentBean[] findAll();
	public AccountmentBean hindByAccountNum(String accountNum);
	public int countAccounts();
	public boolean existAccountNum(String accountNum);
	public String findDate();  //오늘날짜, 현재시간(분까지) 반환
	public void depositMoney(AccountmentBean param);
	public void withdrawMoney(AccountmentBean param);
	public void deleteAccountNum(String accountNum);
}

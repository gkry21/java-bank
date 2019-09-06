package com.bank.web.serviceimpl;

import com.bank.web.domains.AccountBean;
import com.bank.web.domains.MemberBean;
import com.bank.web.services.AccountService;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AccountServiceImpl implements AccountService{
	private List<AccountBean> acc;
	
	public AccountServiceImpl() {
		acc = new ArrayList<>();
	}
	
	@Override
	public void createAccount(int money) {
		AccountBean ab = new AccountBean();
		ab.setAccountNum(createAccountNum());
		ab.setMoney(money + "");
		ab.setRegdate(findDate());
		System.out.println(ab.toString());
		acc.add(ab);
	}

	@Override
	public String createAccountNum() {
		String account= "";
		Random ran = new Random();
		for(int i = 0;i<9;i++) {
			account += (i==4) ? "-" : ran.nextInt(10);
			}
		return account;
	}

	@Override
	public List<AccountBean> findAll() {
		return acc;
	}

	@Override
	public AccountBean findByAccountNum(String accountNum) {
		AccountBean b = new AccountBean(); 
		int count =0;
		for(AccountBean ac : acc) {
			if(acc.contains(accountNum)) {
				b=ac;
				break;
			}
		}
		return b;
	}

	@Override
	public int countAccounts() {
		return acc.size();
	}

	@Override
	public boolean existAccountNum(String accountNum) {
		return acc.contains(findByAccountNum(accountNum));
	}

	@Override
	public String findDate() {
		String today = "";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd hh:mm");
		Date date = new Date();
		today = sdf.format(date);
		return today;
	}

	@Override
	public void depositMoney(AccountBean param) {    // 총합계 , 입금일, 계좌정보 받아와야함, 현재금액 	//String money = findByAccountNum ().getMoney();
																							

	}

	@Override
	public void withdrawMoney(AccountBean param) {
		
	}

	@Override
	public void deleteAccountNum(String accountNum) {
		
	}

}

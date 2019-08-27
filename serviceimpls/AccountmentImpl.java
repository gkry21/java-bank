package com.bank.serviceimpls;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import com.bank.domains.*;
import com.bank.services.AccountmentService;

public class AccountmentImpl implements AccountmentService{
	private AccountBean[] acBeans;
	private int acCount;
	
	public AccountmentImpl() {
			AccountBean[] acBeans = new AccountBean[10];
			acCount = 0;
	}
	@Override
	public void createAccount(int money) {     //이걸 인트머니에 저장함? 왜?
		AccountBean ac = new AccountBean();
		ac.setAccountNum(createAccountNum());
		ac.setMoney(money+"");
		ac.setToday(findDate());
		
		acBeans[acCount] = ac;
		acCount++;
		
	}

	@Override
	public String createAccountNum() { 
		String accountNum = "";
		Random ran = new Random();
		for(int i=0;i<9;i++) {
			accountNum += (i==4)?"-":ran.nextInt(10);
		}
		return accountNum;
		
//		Random ran = new Random();  //이거 4자리 고정해놓는거 고민!
//		int f = ran.nextInt(9999)+1;
//		int f1 = ran.nextInt(9999)+1;
//		String result = String.format("%d- %d", f,f1);
//		return result;
	}

	@Override
	public AccountBean[] accountfindAll() { //전체 계좌 찾기
		return acBeans;
	}

	@Override
	public AccountBean findByAccountNum(String accountNum) { 
		String accNum ="";	
		MemberBean member = new MemberBean();                     
		for(int i=0;i<acCount;i++) {
			if(accountNum.equals(member.getId()) &&
					accountNum.equals(member.getPass())) {
					accNum = acBeans[i].getAccountNum();
					break;
			}
		}
		return null;  
	}

	@Override
	public int countAccounts() {
		return 0;
	}

	@Override
	public boolean existAccountNum(String accountNum) {  //존재하는 계좌
		boolean flag = false; 
		for(int i =0;i<acCount;i++) {
			if(accountNum.equals(acBeans[i].getAccountNum())) {
				 flag = true;
				 break;
			}
		}
		
		return false;
	}

	@Override
	public String findDate() {
		String today = "";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		Date date = new Date();
		today = sdf.format(date);
		return today;
	}

	@Override
	public void depositMoney(AccountBean param) {  //예치금
		
	}

	@Override
	public void withdrawMoney(AccountBean param) {  //출금액
		
	}

	@Override
	public void deleteAccountNum(String accountNum) { 
		for(int i = 0;i<acCount;i++) {  //
			if() {}
		}
		
		
	}

}

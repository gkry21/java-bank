package com.bank.controllers;

import javax.swing.JOptionPane;

import com.bank.domains.MemberBean;
import com.bank.domains.CustomerBean;
import com.bank.serviceimpls.MemberServiceImpl;
import com.bank.services.MemberService;

public class UserController {
		public static void main(String[] args) {
			MemberService service = new MemberServiceImpl();
			MemberBean member = new MemberBean();
			CustomerBean customer = new CustomerBean();
			String msg = "";
			String[] arr = {};
			
			while(true) {
		switch(JOptionPane.showInputDialog("0. 종료 1. 회원가입 2. 로그인 3. 비밀번호 변경 4.아이디존재여부")) {
		case "0" : return;
		case "1" : msg = JOptionPane.showInputDialog(null, "아이디,비밀번호,이름,주민번호");
						arr = msg.split(",");
						member.setId(arr[0]);
						member.setPass(arr[1]);
						member.setName(arr[2]);
						member.setSsn(arr[3]); 
						break;
		case "2" : msg = JOptionPane.showInputDialog("아이디, 비밀번호");
						arr = msg.split(",");
						member.setId(arr[0]);
						member.setPass(arr[1]);
			JOptionPane.showMessageDialog(null, service.login(member));break;
		case "3" :
			String temp = JOptionPane.showInputDialog("아이디,현재비번,변경할 비번");
			arr = temp.split(",");
			member.setId(arr[0]);
			member.setPass(arr[1]+","+arr[2]);
			break;
		case "4" : JOptionPane.showInputDialog("아이디");
		
			JOptionPane.showMessageDialog(null, "가입가능한 아이디");
			break;
		default : break;
		}	
		}
		}
}

package com.bank.controllers;
import com.bank.serviceimpls.*;
import javax.swing.JOptionPane;

public class AdminController {
		public static void main(String[] args) {
			AccountmentImpl account = new AccountmentImpl();		
		while(true) {  
			switch(JOptionPane.showInputDialog("0. 종료 1.오늘 날짜")) {
			case "1" : JOptionPane.showMessageDialog(null, account.findDate());
			case "2" : JOptionPane.showMessageDialog(null, account.createAccountNum());
			}
		}
}
}
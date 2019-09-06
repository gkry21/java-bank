package com.bank.web.daoimpl;
import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;

import com.bank.web.daos.MemberDAO;
import com.bank.web.domains.CustomerBean;
import com.bank.web.domains.EmployeeBean;
import com.bank.web.pool.Constants;
public class MemberDAOImpl implements MemberDAO{
	File file= new File(Constants.FILE_PATH+ "customers0905.txt");
	@Override
	public void insertCustomer(CustomerBean param) {
			try {
				BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
				writer.write(String.format("%s,%s,%s,%s,%s", param.getId(), param.getPw(), param.getName(),param.getSsn(),param.getCredit()));
				writer.newLine();
				writer.flush();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
	}

	@Override
	public void insertEmployee(EmployeeBean param) {
		try {}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public CustomerBean login(CustomerBean param) {
			try {
				FileReader reader = new FileReader(file);
				BufferedReader	br = new BufferedReader(reader);
				String[] temp = new String[5];
				String line = br.readLine();
				temp = line.split(",");
				
				param.setId(temp[0]);
				param.setPw(temp[1]);
				param.setName(temp[2]);
				param.setSsn(temp[3]);
				param.setCredit(temp[4]);
				br.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		return param;
	}

}

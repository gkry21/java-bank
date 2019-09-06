package com.lotto.web.daoimpl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import com.lotto.web.daos.LottoDao;
import com.lotto.web.domains.LottoBean;

public class LottoDAOImpl implements LottoDao{
	public static final String FILE_PATH = String.format("C:%sUsers%suser%seclipse-jee%sjee_lotto1%sWebContent%sresources%stxt%s",
			File.separator,
			File.separator,
			File.separator,
			File.separator,
			File.separator,
			File.separator,
			File.separator,
			File.separator
			);
	
	@Override
	public void insertLotto(LottoBean param) {
		try {
			File file = new File(FILE_PATH+"lotto.txt");
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			System.out.println(param.getLottoSeq()+"/"+param.getLotteryNum());  //확인만해보는거니까 쓰고 지워야함
			writer.write(param.getLottoSeq()+"/"+param.getLotteryNum());
			writer.newLine();
			writer.flush();
		}catch(Exception e) {} 
	}

}

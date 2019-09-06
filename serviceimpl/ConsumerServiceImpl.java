package com.lotto.web.serviceimpl;

import java.util.Random;

import com.lotto.web.daoimpl.ConsumerDAOImpl;
import com.lotto.web.daos.ConsumerDao;
import com.lotto.web.domains.ConsumerBean;
import com.lotto.web.services.ConsumerService;

	
public class ConsumerServiceImpl implements ConsumerService{
	private ConsumerDao dao;
	
	public ConsumerServiceImpl() {
		 dao = new ConsumerDAOImpl();
	}
	@Override
	public void registerConsumer(ConsumerBean param) {
		System.out.println("registerConsumer :"+param.toString());
			dao.insertConsumer(param);
		
	}

}

package com.silva.spring.transation.service.impl;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import com.silva.spring.transation.dao.AccountDao;
import com.silva.spring.transation.service.AccountService;

/**
 * <p>Title: AccountServiceImpl.java</p>
 * <p>Description: </p>
 * @author silvasong Emial:silvasong@aliyun.com
 * @date 2015年9月6日 下午9:33:11
 * @version 1.0
 */

public class AccountServiceImpl implements AccountService {

	private AccountDao accountDao;
	
	private TransactionTemplate transactionTemplate;
	
	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}

	
  
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
	public void transfer(final String out, final String in, final Double money) {
		// TODO Auto-generated method stub
		transactionTemplate.execute(new TransactionCallback() {

			public Object doInTransaction(TransactionStatus status) {
				// TODO Auto-generated method stub
				accountDao.outMoney(out, money);
				int i = 1/0;
				accountDao.inMoney(in, money);
				return null;
			}
		});
		

	}

}

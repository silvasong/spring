package com.silva.spring.transation.dao.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.silva.spring.transation.dao.AccountDao;

/**
 * <p>Title: AcountDaoImpl.java</p>
 * <p>Description: </p>
 * @author silvasong Emial:silvasong@aliyun.com
 * @date 2015年9月6日 下午9:53:26
 * @version 1.0
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao{
	
	

	public void inMoney(String in, Double money) {
		// TODO Auto-generated method stub
		
		String sql = "update spring_transaction_account set money = money + ? where name = ? ";
		this.getJdbcTemplate().update(sql, money,in);		
	}

	public void outMoney(String out, Double money) {
		// TODO Auto-generated method stub
		String sql = "update spring_transaction_account set money = money - ? where name = ?";
		this.getJdbcTemplate().update(sql, money,out);	
	}

}

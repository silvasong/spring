package com.silva.spring.transation.dao;
/**
 * <p>Title: AccoutDao.java</p>
 * <p>Description: </p>
 * @author silvasong Emial:silvasong@aliyun.com
 * @date 2015年9月6日 下午9:50:13
 * @version 1.0
 */
public interface AccountDao {
	
	public void inMoney(String in,Double money);
	
	public void outMoney(String out,Double money);

}

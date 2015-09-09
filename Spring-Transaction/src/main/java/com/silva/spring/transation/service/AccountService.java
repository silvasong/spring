package com.silva.spring.transation.service;
/**
 * <p>Title: AccoutService.java</p>
 * <p>Description: </p>
 * @author silvasong Emial:silvasong@aliyun.com
 * @date 2015年9月6日 下午9:29:38
 * @version 1.0
 */
public interface AccountService {
	
	public void transfer(String out,String in,Double money);

}

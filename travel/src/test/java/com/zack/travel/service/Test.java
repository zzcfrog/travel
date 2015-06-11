package com.zack.travel.service;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.zack.travel.dao.ITravelTestDAO;
import com.zack.travel.domain.TravelTestDO;

@ContextConfiguration(locations={"classpath:spring-beans.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
//�����true����ı����ݿ����ݣ������false��ı�����
@TransactionConfiguration(transactionManager="transactionManager",defaultRollback=true)
public class Test {

	 @Autowired
	 ITestService testService;
	 
	 @Autowired
	 ITravelTestDAO travelTestDAO;
	 
	 @org.junit.Test
	 public void test(){
		 testService.test();
		 TravelTestDO a = travelTestDAO.getById(1);
		 System.out.println(a.getUserName());
	 }
}

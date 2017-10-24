package org.mybatis.news.ssm.service;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.news.ssm.vo.Emps;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import junit.framework.TestCase;
@ContextConfiguration(locations= {"classpath:spring/spring-*.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestEmpsService extends TestCase{
	@Resource
	private IEmpsService servie;
	@Test
	public void add() {
		Emps emps =new Emps();
		emps.setComm(233.0);
		emps.setEname("ROMs");
		emps.setHiredate(new Date());
		emps.setSalary(999.0);
		System.out.println(this.servie.add(emps));
	}
	@Test
	public void list() {
		
		List<Emps> list=servie.list();
		Emps vo=new Emps();
		vo.setEid(1L);
		Iterator<Emps> iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}

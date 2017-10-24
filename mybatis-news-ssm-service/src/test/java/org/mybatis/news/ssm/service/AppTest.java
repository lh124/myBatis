package org.mybatis.news.ssm.service;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.news.ssm.vo.News;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import junit.framework.TestCase;

@ContextConfiguration(locations = "classpath:spring/spring-*.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class AppTest  extends TestCase{
	@Resource
	private INewsService newsService;
	@Test
	public void testAdd() {
		News vo = new News();
		vo.setTitle("世界11");
		vo.setNote("世界的和平11");
		vo.setPhoto("111");
		System.err.println(this.newsService.add(vo));
	}

	@Test
	public void testListByIds() {
		Set<Long> ids = new HashSet<Long>();
		ids.add(1L);
		ids.add(3L);
		ids.add(5L);
		System.err.println(this.newsService.listByIds(ids));
	}

	@Test
	public void testListSplit() {
		System.err.println(this.newsService.list(1, 2, "", null));
	}
}

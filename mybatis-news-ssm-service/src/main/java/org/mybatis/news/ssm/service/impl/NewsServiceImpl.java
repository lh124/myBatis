package org.mybatis.news.ssm.service.impl;

import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.mybatis.news.ssm.dao.INewsDAO;
import org.mybatis.news.ssm.service.INewsService;
import org.mybatis.news.ssm.service.abs.AbstractService;
import org.mybatis.news.ssm.vo.News;
import org.springframework.stereotype.Service;
@Service
public class NewsServiceImpl  extends AbstractService implements INewsService {
	@Resource
	private INewsDAO newsdao;

	@Override
	public boolean add(News vo) {
	
		return this.newsdao.doCreate(vo);
	}

	@Override
	public List<News> listByIds(Set<Long> ids) {
		
		return this.newsdao.findByIds(ids.toArray());
	}

	@Override
	public List<News> list(long currentPage, int lineSize, String column, String keyWord) {
		
		return this.newsdao.findSplit(super.paramToMap(currentPage, lineSize, column, keyWord));
	}

}

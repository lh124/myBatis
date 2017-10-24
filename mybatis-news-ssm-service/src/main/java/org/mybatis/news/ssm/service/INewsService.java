package org.mybatis.news.ssm.service;

import java.util.List;
import java.util.Set;

import org.mybatis.news.ssm.vo.News;

public interface INewsService {

	public boolean add(News vo);
	
	public List<News> listByIds(Set<Long> ids);
	
	public List<News> list(long currentPage, int lineSize, String column, String keyWord);

	
}

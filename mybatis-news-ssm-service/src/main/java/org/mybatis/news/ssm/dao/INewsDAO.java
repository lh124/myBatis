package org.mybatis.news.ssm.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.news.ssm.vo.News;

public interface INewsDAO {
	/**
	 * 增加数据
	 * @param vo
	 * @return
	 */
	public boolean doCreate(News vo) ;
	/**
	 * 修改数据
	 * @param vo
	 * @return
	 */
	public boolean doEdit(News vo);
	/**
	 * 删除数据  根据id
	 * @param id
	 * @return
	 */
	public boolean doRemove(Long id) ;
	
	public List<News> findByIds(Object ids) ; 
	/**
	 * 分页
	 * @param params
	 * @return
	 */
	public List<News> findSplit(Map<String,Object> params) ;
	/**
	 * 根据id 查询数据
	 * @param id
	 * @return
	 */
	public News findById(Long id) ;
}

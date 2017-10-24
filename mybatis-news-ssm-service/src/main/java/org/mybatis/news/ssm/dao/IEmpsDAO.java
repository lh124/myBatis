package org.mybatis.news.ssm.dao;

import java.util.List;
import java.util.Set;

import org.mybatis.news.ssm.vo.Emps;

public interface IEmpsDAO {

	public boolean doCreate(Emps vo);
	public boolean doEdit(Emps vo);
	public boolean doRemove(Long id) ;
	public boolean doRemove(Set<Long> ids);
	
	public List<Emps> findAll();
}

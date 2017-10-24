package org.mybatis.news.ssm.service;

import java.util.List;

import org.mybatis.news.ssm.vo.Emps;

public interface IEmpsService {

	public boolean add(Emps vo);
	public boolean edit(Emps vo);
	public boolean delete(Long id);
	public List<Emps> list();
}

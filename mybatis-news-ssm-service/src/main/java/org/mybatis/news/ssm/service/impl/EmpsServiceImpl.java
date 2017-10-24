package org.mybatis.news.ssm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.news.ssm.dao.IEmpsDAO;
import org.mybatis.news.ssm.service.IEmpsService;
import org.mybatis.news.ssm.vo.Emps;
import org.springframework.stereotype.Service;
@Service
public class EmpsServiceImpl implements IEmpsService{
	@Resource
	private IEmpsDAO empdao;

	@Override
	public boolean add(Emps vo) {
		// TODO Auto-generated method stub
		return this.empdao.doCreate(vo);
	}

	@Override
	public boolean edit(Emps vo) {
		// TODO Auto-generated method stub
		return this.empdao.doEdit(vo);
	}

	@Override
	public boolean delete(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Emps> list() {
	
		return empdao.findAll();
	}

}

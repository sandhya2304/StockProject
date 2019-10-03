package com.stockmvc.myapp.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.stockmvc.myapp.dao.IMvStkDao;
import com.stockmvc.myapp.entities.MvStk;
import com.stockmvc.myapp.services.IMvstkService;



@Transactional
public class MvStkServiceImpl implements IMvstkService
{
	
	IMvStkDao dao;
	
	public void setDao(IMvStkDao dao) {
		this.dao = dao;
	}

	@Override
	public MvStk save(MvStk entity) {
		return dao.save(entity);
	}

	@Override
	public MvStk update(MvStk entity) {
		return dao.update(entity);
	}

	@Override
	public List<MvStk> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<MvStk> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public MvStk getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
	   dao.remove(id);
	}

	@Override
	public MvStk findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public MvStk findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}
	
	
	
}

package com.stockmvc.myapp.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.stockmvc.myapp.dao.ISaleDao;
import com.stockmvc.myapp.entities.Sale;
import com.stockmvc.myapp.services.ISaleService;



@Transactional
public class SaleServiceImpl implements ISaleService
{
	
	ISaleDao dao;
	
	public void setDao(ISaleDao dao) {
		this.dao = dao;
	}

	@Override
	public Sale save(Sale entity) {
		return dao.save(entity);
	}

	@Override
	public Sale update(Sale entity) {
		return dao.update(entity);
	}

	@Override
	public List<Sale> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<Sale> selectAll(String sortField, String sort) {
		return dao.selectAll();
	}

	@Override
	public Sale getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
		
	}

	@Override
	public Sale findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public Sale findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}
	
	
	
}

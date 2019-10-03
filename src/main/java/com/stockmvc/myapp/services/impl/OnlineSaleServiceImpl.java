package com.stockmvc.myapp.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.stockmvc.myapp.dao.IOnlineSaleDao;
import com.stockmvc.myapp.entities.OnlineSale;
import com.stockmvc.myapp.services.IOnlineSaleService;



@Transactional
public class OnlineSaleServiceImpl implements IOnlineSaleService
{
	
	IOnlineSaleDao dao;
	
	public void setDao(IOnlineSaleDao dao) {
		this.dao = dao;
	}

	@Override
	public OnlineSale save(OnlineSale entity) {
		return dao.save(entity);
	}

	@Override
	public OnlineSale update(OnlineSale entity) {
		return dao.update(entity);
	}

	@Override
	public List<OnlineSale> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<OnlineSale> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public OnlineSale getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
		
	}

	@Override
	public OnlineSale findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public OnlineSale findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}
	
	
	
	
}

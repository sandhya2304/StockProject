package com.stockmvc.myapp.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.stockmvc.myapp.dao.IOrderClient;
import com.stockmvc.myapp.entities.OrderClient;
import com.stockmvc.myapp.services.IOrderClientService;



@Transactional
public class OrderClientServiceImpl implements IOrderClientService
{
	
	IOrderClient dao;
	
	public void setDao(IOrderClient dao) {
		this.dao = dao;
	}

	@Override
	public OrderClient save(OrderClient entity) {
		return dao.save(entity);
	}

	@Override
	public OrderClient update(OrderClient entity) {
		return dao.update(entity);
	}

	@Override
	public List<OrderClient> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<OrderClient> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public OrderClient getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public OrderClient findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public OrderClient findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}
	
	
	
	
}

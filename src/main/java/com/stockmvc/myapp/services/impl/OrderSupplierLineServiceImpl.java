package com.stockmvc.myapp.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.stockmvc.myapp.dao.IOrderSupplierLineDao;
import com.stockmvc.myapp.entities.OrderSupplierLine;


@Transactional
public class OrderSupplierLineServiceImpl implements IOrderSupplierLineDao
{
	
	IOrderSupplierLineDao dao;
	
	public void setDao(IOrderSupplierLineDao dao) {
		this.dao = dao;
	}

	@Override
	public OrderSupplierLine save(OrderSupplierLine entity) {
		return dao.save(entity);
	}

	@Override
	public OrderSupplierLine update(OrderSupplierLine entity) {
		return dao.update(entity);
	}

	@Override
	public List<OrderSupplierLine> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<OrderSupplierLine> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public OrderSupplierLine getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
		
	}

	@Override
	public OrderSupplierLine findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public OrderSupplierLine findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}
	
	
}

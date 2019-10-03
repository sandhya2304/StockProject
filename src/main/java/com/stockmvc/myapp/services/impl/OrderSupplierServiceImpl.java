package com.stockmvc.myapp.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.stockmvc.myapp.dao.IOrderSupplierDao;
import com.stockmvc.myapp.entities.OrderSupplier;
import com.stockmvc.myapp.services.IOrderSupplierService;


@Transactional
public class OrderSupplierServiceImpl implements IOrderSupplierService
{
	
	IOrderSupplierDao dao;
	
	public void setDao(IOrderSupplierDao dao) {
		this.dao = dao;
	}

	@Override
	public OrderSupplier save(OrderSupplier entity) {
		return dao.save(entity);
	}

	@Override
	public OrderSupplier update(OrderSupplier entity) {
		return dao.update(entity);
	}

	@Override
	public List<OrderSupplier> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<OrderSupplier> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public OrderSupplier getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
		
	}

	@Override
	public OrderSupplier findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public OrderSupplier findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}
	
	
	
	
	
}

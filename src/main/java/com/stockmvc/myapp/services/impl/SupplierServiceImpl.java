package com.stockmvc.myapp.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.stockmvc.myapp.dao.ISupplierDao;
import com.stockmvc.myapp.entities.Supplier;
import com.stockmvc.myapp.services.ISupplierService;



@Transactional
public class SupplierServiceImpl implements ISupplierService
{
	
	ISupplierDao dao;
	
	public void setDao(ISupplierDao dao) {
		this.dao = dao;
	}

	@Override
	public Supplier save(Supplier entity) {
		return dao.save(entity);
	}

	@Override
	public Supplier update(Supplier entity) {
		return dao.update(entity);
	}

	@Override
	public List<Supplier> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<Supplier> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public Supplier getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
		
	}

	@Override
	public Supplier findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public Supplier findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {

		return dao.findCountBy(paramName, paramValue);
	}
	
	
	
	
}

package com.stockmvc.myapp.services;

import java.util.List;

import com.stockmvc.myapp.entities.Sale;



public interface ISaleService 
{
	
    public Sale save(Sale entity);
	
	public Sale update(Sale entity);
	
	public List<Sale> selectAll();
	
	public List<Sale> selectAll(String sortField, String sort);
	
	public Sale getById(Long id);
	
	public void remove(Long id);
	
	public Sale findOne(String paramName, Object paramValue);
	
	public Sale findOne(String[] paramNames, Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);
	
	

}

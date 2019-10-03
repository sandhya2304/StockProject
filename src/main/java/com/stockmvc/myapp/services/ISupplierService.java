package com.stockmvc.myapp.services;

import java.util.List;

import com.stockmvc.myapp.entities.Supplier;



public interface ISupplierService 
{
	
    public Supplier save(Supplier entity);
	
	public Supplier update(Supplier entity);
	
	public List<Supplier> selectAll();
	
	public List<Supplier> selectAll(String sortField, String sort);
	
	public Supplier getById(Long id);
	
	public void remove(Long id);
	
	public Supplier findOne(String paramName, Object paramValue);
	
	public Supplier findOne(String[] paramNames, Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);
	
	

}

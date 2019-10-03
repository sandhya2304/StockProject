package com.stockmvc.myapp.services;

import java.util.List;

import com.stockmvc.myapp.entities.OnlineSale;

public interface IOnlineSaleService 
{
	
    public OnlineSale save(OnlineSale entity);
	
	public OnlineSale update(OnlineSale entity);
	
	public List<OnlineSale> selectAll();
	
	public List<OnlineSale> selectAll(String sortField, String sort);
	
	public OnlineSale getById(Long id);
	
	public void remove(Long id);
	
	public OnlineSale findOne(String paramName, Object paramValue);
	
	public OnlineSale findOne(String[] paramNames, Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);
	
	

}

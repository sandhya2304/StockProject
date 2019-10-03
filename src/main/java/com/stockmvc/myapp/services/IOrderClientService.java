package com.stockmvc.myapp.services;

import java.util.List;

import com.stockmvc.myapp.entities.OrderClient;



public interface IOrderClientService 
{
	
    public OrderClient save(OrderClient entity);
	
	public OrderClient update(OrderClient entity);
	
	public List<OrderClient> selectAll();
	
	public List<OrderClient> selectAll(String sortField, String sort);
	
	public OrderClient getById(Long id);
	
	public void remove(Long id);
	
	public OrderClient findOne(String paramName, Object paramValue);
	
	public OrderClient findOne(String[] paramNames, Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);
	
	

}

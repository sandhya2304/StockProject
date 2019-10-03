package com.stockmvc.myapp.services;
import java.util.List;

import com.stockmvc.myapp.entities.OrderSupplier;



public interface IOrderSupplierService 
{
	
    public OrderSupplier save(OrderSupplier entity);
	
	public OrderSupplier update(OrderSupplier entity);
	
	public List<OrderSupplier> selectAll();
	
	public List<OrderSupplier> selectAll(String sortField, String sort);
	
	public OrderSupplier getById(Long id);
	
	public void remove(Long id);
	
	public OrderSupplier findOne(String paramName, Object paramValue);
	
	public OrderSupplier findOne(String[] paramNames, Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);
	
	

}

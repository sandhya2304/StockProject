package com.stockmvc.myapp.services;

import java.util.List;

import com.stockmvc.myapp.entities.MvStk;


public interface IMvstkService 
{
	
public MvStk save(MvStk entity);
	
	public MvStk update(MvStk entity);
	
	public List<MvStk> selectAll();
	
	public List<MvStk> selectAll(String sortField, String sort);
	
	public MvStk getById(Long id);
	
	public void remove(Long id);
	
	public MvStk findOne(String paramName, Object paramValue);
	
	public MvStk findOne(String[] paramNames, Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);
	

}

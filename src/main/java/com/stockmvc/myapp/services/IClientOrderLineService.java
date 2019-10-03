package com.stockmvc.myapp.services;
import java.util.List;

import com.stockmvc.myapp.entities.ClientOrderLine;


public interface IClientOrderLineService 
{
	
public ClientOrderLine save(ClientOrderLine entity);
	
	public ClientOrderLine update(ClientOrderLine entity);
	
	public List<ClientOrderLine> selectAll();
	
	public List<ClientOrderLine> selectAll(String sortField, String sort);
	
	public ClientOrderLine getById(Long id);
	
	public void remove(Long id);
	
	public ClientOrderLine findOne(String paramName, Object paramValue);
	
	public ClientOrderLine findOne(String[] paramNames, Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);

	public List<ClientOrderLine> getbyIdOrder(Long idCommandeClient);
	

}

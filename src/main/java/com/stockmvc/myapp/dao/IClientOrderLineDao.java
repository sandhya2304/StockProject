package com.stockmvc.myapp.dao;

import java.util.List;

import com.stockmvc.myapp.entities.ClientOrderLine;



public interface IClientOrderLineDao extends IGenericDao<ClientOrderLine>
{
	public List<ClientOrderLine> getbyIdOrder(Long idCommandeClient);
 
}

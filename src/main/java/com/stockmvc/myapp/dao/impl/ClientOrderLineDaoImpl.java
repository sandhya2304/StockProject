package com.stockmvc.myapp.dao.impl;

import java.util.List;

import javax.persistence.Query;

import com.stockmvc.myapp.dao.IClientOrderLineDao;
import com.stockmvc.myapp.entities.ClientOrderLine;


public class ClientOrderLineDaoImpl extends GenericDaoImpl<ClientOrderLine> implements IClientOrderLineDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<ClientOrderLine> getbyIdOrder(Long idCommandeClient)
	{
		String queryString = "select lc from " + ClientOrderLine.class.getSimpleName() + " lc where lc.commandeClient.idCommandeClient = :x";
		Query query = em.createQuery(queryString);
		query.setParameter("x", idCommandeClient);
		return query.getResultList();
	}

	
}

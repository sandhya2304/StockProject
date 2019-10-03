package com.stockmvc.myapp.services.impl;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.stockmvc.myapp.dao.IClientOrderLineDao;
import com.stockmvc.myapp.entities.ClientOrderLine;
import com.stockmvc.myapp.services.IClientOrderLineService;



@Transactional
public class ClientOrderLineServiceImpl implements IClientOrderLineService
{
	
	IClientOrderLineDao dao;
	
	public void setDao(IClientOrderLineDao dao) {
		this.dao = dao;
	}

	@Override
	public ClientOrderLine save(ClientOrderLine entity) {
		return dao.save(entity);
	}

	@Override
	public ClientOrderLine update(ClientOrderLine entity) {
		return dao.update(entity);
	}

	@Override
	public List<ClientOrderLine> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<ClientOrderLine> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public ClientOrderLine getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public ClientOrderLine findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public ClientOrderLine findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

	@Override
	public List<ClientOrderLine> getbyIdOrder(Long idCommandeClient) {
		// TODO Auto-generated method stub
		return dao.getbyIdOrder(idCommandeClient);
	}
	
	
}

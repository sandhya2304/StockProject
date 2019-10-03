package com.stockmvc.myapp.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.stockmvc.myapp.dao.IGenericDao;


@SuppressWarnings("unchecked")
public class GenericDaoImpl<E> implements IGenericDao<E>
{
	@PersistenceContext
	EntityManager em;
	
	private Class<E> type;	
	
	public GenericDaoImpl()
	{
		Type t = getClass().getGenericSuperclass();
		ParameterizedType pt = (ParameterizedType) t;
		type = (Class<E>) pt.getActualTypeArguments()[0];
		
	}
	
	public Class<E> getType() {
		return type;
	}
	

	@Override
	public E save(E entity)
	{
		em.persist(entity);
		return entity;
	}

	@Override
	public E update(E entity) {
		return em.merge(entity);
	}

	@Override
	public List<E> selectAll() {
		Query q= em.createQuery("select t from"+type.getSimpleName()+"t");
		return q.getResultList();
	}

	@Override
	public List<E> selectAll(String sortField, String sort) 
	{
		Query q = em.createQuery("select t from"+type.getSimpleName()+"t order by"+sortField+" "+sort);
		return q.getResultList();
	}

	@Override
	public E getById(Long id) {
		return em.find(type,id);
	}

	@Override
	public void remove(Long id) {
		E tab = em.getReference(type,id);
		em.remove(tab);
	}

	@Override
	public E findOne(String paramName, Object paramValue) 
	{
		Query q = em.createQuery("select t from"+type.getSimpleName()+"t where"+paramName+"= :x");
		q.setParameter(paramName,paramValue);
		return q.getResultList().size()>0 ? (E) q.getResultList().get(0) : null;
	}

	@Override
	public E findOne(String[] paramNames, Object[] paramValues)
	{
		if(paramNames.length!= paramValues.length)
		{
			return null;
		}
		
		 String query = "select e from "+type.getSimpleName()+" e where ";
		 int len = paramNames.length;
		 
		 for(int i = 0; i < len;i++)
		 {
			 query += "e."+paramNames[i]+"= :x"+i;
			 if((i+1) < len)
			 {
				 query += " and";
			 }			 
		 }
		 Query q = em.createQuery(query);
		 for(int i=0;i<paramValues.length;i++)
		 {
			 q.setParameter("x"+i,paramValues[i]);
		 }
		
		return q.getResultList().size() > 0 ? (E) q.getResultList().get(0) : null;
	}

	@Override
	public int findCountBy(String paramName, String paramValue)
	{
		Query query=em.createQuery("select t from "+type.getSimpleName() + " t where "+paramName + "= :x");
		query.setParameter(paramName,paramValue);
		return query.getResultList().size() > 0 ? ((Long) query.getSingleResult()).intValue() : 0;
	}
	

}

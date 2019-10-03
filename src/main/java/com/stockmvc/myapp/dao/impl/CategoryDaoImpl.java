package com.stockmvc.myapp.dao.impl;

import java.util.List;

import javax.persistence.Query;

import com.stockmvc.myapp.dao.ICategoryDao;
import com.stockmvc.myapp.entities.Article;
import com.stockmvc.myapp.entities.Category;


public class CategoryDaoImpl extends GenericDaoImpl<Category> implements ICategoryDao
{

	@SuppressWarnings("unchecked")
	@Override
	public List<Article> selectAllArticleByCategory(Long idCategory) 
	{
		Query query=em.createQuery("select a from "+Article.class.getSimpleName() + "a where a.category.idcategory =:x");
		query.setParameter("x",idCategory);
		
		return query.getResultList();
	}

}

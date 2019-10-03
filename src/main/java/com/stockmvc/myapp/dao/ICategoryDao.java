package com.stockmvc.myapp.dao;

import java.util.List;

import com.stockmvc.myapp.entities.Article;
import com.stockmvc.myapp.entities.Category;



public interface ICategoryDao extends IGenericDao<Category>
{
	public List<Article> selectAllArticleByCategory(Long idCategory);

}

package com.stockmvc.myapp;

import com.stockmvc.myapp.dao.impl.FlickrDaoImpl;

public class TestStock
{
	public static void main(String[] args)
	{
		FlickrDaoImpl flickDao = new FlickrDaoImpl();
		flickDao.auth();
		
		
	}

}

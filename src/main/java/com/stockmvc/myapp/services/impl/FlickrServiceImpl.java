package com.stockmvc.myapp.services.impl;
import java.io.InputStream;

import com.stockmvc.myapp.dao.IFlickrDao;
import com.stockmvc.myapp.services.IFlickrService;



public class FlickrServiceImpl implements IFlickrService
{
	IFlickrDao dao;
	
	public void setDao(IFlickrDao dao) {
		this.dao = dao;
	}

	@Override
	public String savePhoto(InputStream photo, String title) throws Exception {
		return dao.savePhoto(photo, title);
	}
	
	
	

}

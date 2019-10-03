package com.stockmvc.myapp.dao;

import java.io.InputStream;

public interface IFlickrDao
{
	public String savePhoto(InputStream photo,String file)throws Exception;

}

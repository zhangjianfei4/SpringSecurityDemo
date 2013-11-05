package com.hskj.util;

import org.springframework.beans.factory.annotation.Autowired;

import com.hskj.controller.TestDAO;

public class ConUtil {
	@Autowired
	TestDAO testDao;
	public String f(){
		testDao.getdao();
		System.out.println("constructor...");
		
		return "constructor";
	}
}

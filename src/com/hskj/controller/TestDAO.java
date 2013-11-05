package com.hskj.controller;

import org.springframework.stereotype.Service;

@Service
public class TestDAO {
	public String getdao(){
		System.out.println("...............dao.............");
		return "dao";
	}
}

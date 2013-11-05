package com.hskj.exception;

public class MyException extends Exception {
	private static final long serialVersionUID = 1L;

	public MyException(String ex) {
		System.out.println(ex);
	}


}

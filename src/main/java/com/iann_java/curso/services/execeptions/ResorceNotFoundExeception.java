package com.iann_java.curso.services.execeptions;

public class ResorceNotFoundExeception extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public ResorceNotFoundExeception(Object id) {
		super("Resource not found. Id " + id);
	}
	
	

}

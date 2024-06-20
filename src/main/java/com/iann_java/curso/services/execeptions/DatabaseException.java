package com.iann_java.curso.services.execeptions;

import org.hibernate.boot.model.relational.Database;

public class DatabaseException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public DatabaseException(String msg) {
		super(msg);
	}
}

package com.arenamilgaru.workshopmongo.service.exceptions;

public class ObjectNotFounException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public ObjectNotFounException(String msg) {
		super(msg);
	}

}

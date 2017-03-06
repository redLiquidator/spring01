package com.example.exception;

public class NotFoundRuntimeException extends RuntimeException{

	public NotFoundRuntimeException(){
		
	}
	
	public NotFoundRuntimeException(String msg){
		super(msg);
}
	
}

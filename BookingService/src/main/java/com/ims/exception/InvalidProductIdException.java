package com.ims.exception;
@SuppressWarnings("serial")
public class InvalidProductIdException extends RuntimeException{
	public InvalidProductIdException(String msg)
	{
		super(msg);
	}

}

package com.cognixia.group4.exception;

public class ResourceNotFoundException extends Exception {
	
	private static final long serialVersionUID = 1L;
		
		public ResourceNotFoundException(String msg) {
			super(msg + " was not found");
		}
		
}

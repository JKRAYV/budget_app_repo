package com.cognixia.group4.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public ResponseEntity<?> resourceNotFoundException( ResourceNotFoundException ex, WebRequest request ) {
		
		// request.getDescription(false) => details on the request (usually includes the uri path where request was made)
		ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
		
		// when the exception gets thrown, instead of returning the exception as json in the response,
		// return instead this response entity
		return ResponseEntity.status(404).body(errorDetails);
		
	}

}

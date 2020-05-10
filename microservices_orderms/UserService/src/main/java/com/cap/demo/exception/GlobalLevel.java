package com.cap.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalLevel{
	@ResponseBody
	@ResponseStatus(value=HttpStatus.OK)
	@ExceptionHandler(UnsuccessfulOperation.class) 
	public ResponseEntity<String> unsuccessfulOperation(UnsuccessfulOperation e) { return new
	  ResponseEntity<>(e.getMessage(), HttpStatus.OK); }
	 
}

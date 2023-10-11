package com.example.StudentDetails.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
	@ExceptionHandler(AgeNotFoundException.class)
	public ResponseEntity<Object>AgeHandle(AgeNotFoundException add){
		return new ResponseEntity<>(add.getMessage(),HttpStatus.NOT_FOUND);
	}

}

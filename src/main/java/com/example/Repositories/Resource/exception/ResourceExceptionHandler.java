package com.example.Repositories.Resource.exception;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.Repositories.Services.Exception.ResourceNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {
	@ExceptionHandler(ResourceNotFoundException.class)
      public ResponseEntity<StandardError>resourceNotFound(ResourceNotFoundException e, HttpServletRequest request){
    	 String error = "Resorce not found";
    	 HttpStatus status = HttpStatus.NOT_FOUND;
    	 StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
    	 return ResponseEntity.status(status).body(err); 
	}
}

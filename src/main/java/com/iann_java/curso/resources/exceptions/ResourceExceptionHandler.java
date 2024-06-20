package com.iann_java.curso.resources.exceptions;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.iann_java.curso.services.execeptions.ResorceNotFoundExeception;

import jakarta.servlet.http.HttpServletRequest;

// intercepta as exceções para esse objeto possa tratar
@ControllerAdvice
public class ResourceExceptionHandler {
	
	//intercepta qualquer do tipo ResorceNotFoundExeception e vai fazer o tratamento dessa função
	@ExceptionHandler(ResorceNotFoundExeception.class)
	public ResponseEntity<StandardError> resourceNotFound(ResorceNotFoundExeception e, HttpServletRequest request){
		String error = "Resource not found";
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(err);
	}

}

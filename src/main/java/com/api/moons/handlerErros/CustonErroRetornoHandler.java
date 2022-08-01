package com.api.moons.handlerErros;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.api.moons.exceptions.ReturnObjectFailedExceptionsMessage;
import com.api.moons.modelError.modelError;

@RestControllerAdvice
public class CustonErroRetornoHandler {

	@ExceptionHandler(ReturnObjectFailedExceptionsMessage.class)
 	public modelError returnErroCustom(ReturnObjectFailedExceptionsMessage  ex, WebRequest request) {
		modelError error = new modelError(
				HttpStatus.NO_CONTENT.value(),
				new Date(),
				ex.getMessage(),
				request.getDescription(false));
		
				return error;	
	}
}

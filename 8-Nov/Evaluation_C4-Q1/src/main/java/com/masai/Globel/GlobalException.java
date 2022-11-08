package com.masai.Globel;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.masai.Exception.EmployeeException;

@ControllerAdvice
public class GlobalException {
	
	
	@ExceptionHandler(EmployeeException.class)
	public ResponseEntity<String> empExceptionHandler(EmployeeException emp){
		
		return new ResponseEntity<String>(emp.getMessage(),HttpStatus.BAD_REQUEST);
	}
	
	public ResponseEntity<ErrorFild> globelExepHandler(ErrorFild em){
		
		ErrorFild er=new ErrorFild();
		er.setTimestamp(LocalDateTime.now());
		er.setMsg(em.getMsg());
//		er.setDesc(em.getB);
		
		return new ResponseEntity<ErrorFild>(er,HttpStatus.BAD_REQUEST);
	}
	

}

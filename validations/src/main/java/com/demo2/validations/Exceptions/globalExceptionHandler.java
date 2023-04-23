package com.demo2.validations.Exceptions;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
//@ControllerAdvice
public class globalExceptionHandler {
    
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String, String> methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException exception){
        Map<String, String> map = new HashMap<>();
        exception.getFieldErrors().forEach(e-> {
            String fieldName = e.getField();
            String defaultMessage = e.getDefaultMessage();
            map.put(fieldName, defaultMessage);
        });
        return map;
    }

    @ExceptionHandler(ApiExecption.class)
    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    public String apiExceptionHandler(ApiExecption execption){
        String message = execption.getMessage();
        Boolean isSuccess = execption.getIsSuccess();

        return message;
    }
}

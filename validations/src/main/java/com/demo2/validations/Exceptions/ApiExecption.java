package com.demo2.validations.Exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class ApiExecption extends RuntimeException {
    private String message;
    private Boolean isSuccess;

    public ApiExecption(String message, Boolean isSuccess){
        this.message = message;
        this.isSuccess = isSuccess;
    }
}

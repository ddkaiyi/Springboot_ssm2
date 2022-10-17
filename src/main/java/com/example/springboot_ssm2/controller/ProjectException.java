package com.example.springboot_ssm2.controller;


import com.example.springboot_ssm2.exception.BusinessException;
import com.example.springboot_ssm2.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class ProjectException {
    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException ex){

        return new Result(ex.getCode(),ex.getMessage(),null);
    }
    @ExceptionHandler(BusinessException.class)
    public Result doException(BusinessException ex){
        return new Result(ex.getCode(),null,ex.getMessage());

    }
}

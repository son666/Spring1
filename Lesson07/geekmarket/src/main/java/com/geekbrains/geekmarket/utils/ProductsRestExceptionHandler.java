package com.geekbrains.geekmarket.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductsRestExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<com.geekbrains.geekmarket.utils.ProductsErrorResponse> handleAllException(Exception exc) {
        com.geekbrains.geekmarket.utils.ProductsErrorResponse studentsErrorResponse = new com.geekbrains.geekmarket.utils.ProductsErrorResponse();
        studentsErrorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
        studentsErrorResponse.setMessage(exc.getMessage());
        studentsErrorResponse.setTimestamp(System.currentTimeMillis());
        return new ResponseEntity<>(studentsErrorResponse, HttpStatus.BAD_REQUEST);
    }
}

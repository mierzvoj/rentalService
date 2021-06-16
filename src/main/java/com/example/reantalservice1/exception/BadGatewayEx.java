package com.example.reantalservice1.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class BadGatewayEx extends RuntimeException {
    @ExceptionHandler(BadGatewayEx.class)
    public ResponseEntity<Object> handleRuntimeEx(BadGatewayEx ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_GATEWAY);
    }
}

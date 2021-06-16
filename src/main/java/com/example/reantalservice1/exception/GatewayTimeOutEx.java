package com.example.reantalservice1.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GatewayTimeOutEx extends RuntimeException {
    @ExceptionHandler(GatewayTimeOutEx.class)
    public ResponseEntity<Object> handleRuntimeException(GatewayTimeOutEx ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.GATEWAY_TIMEOUT);
    }

}

package com.example.reantalservice1.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class BadRequestEx extends RuntimeException {
    @ExceptionHandler(BadRequestEx.class)
    public ResponseEntity<Object> handleRuntimeException(BadRequestEx ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }

}

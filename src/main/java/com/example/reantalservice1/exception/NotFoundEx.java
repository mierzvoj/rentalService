package com.example.reantalservice1.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class NotFoundEx extends RuntimeException {
    @ExceptionHandler(NotFoundEx.class)
    public ResponseEntity<Object> handleRuntimeException(NotFoundEx ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);

    }
}

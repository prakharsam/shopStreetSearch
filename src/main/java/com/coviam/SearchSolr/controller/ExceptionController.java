package com.coviam.SearchSolr.controller;


import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionController {

    private static final org.slf4j.Logger LOG = LoggerFactory.getLogger(ExceptionController.class);

    @Autowired private MessageSource messageSource;

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> runTimeException(RuntimeException ex){

        LOG.warn("Get Command Exception",ex);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(ex.getMessage());

    }

}

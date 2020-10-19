package com.homeschooltracker.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
class ParentNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(ParentNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String parentNotFoundHandler(ParentNotFoundAdvice ex) {
        // return ex.getMessage();
        return "There was an error!";
    }
}
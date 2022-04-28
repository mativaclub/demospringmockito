package com.springmockito.demospringmockkito.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EmployeeExistsException extends RuntimeException {

    public static final String DEFAULT_MESSAGE = "Employee Exists";

    public EmployeeExistsException() {
        this(DEFAULT_MESSAGE);
    }

    public EmployeeExistsException(String message) {
        super(message);
    }

}

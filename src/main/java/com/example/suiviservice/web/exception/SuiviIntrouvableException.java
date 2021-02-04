package com.microservice.suiviservice.web.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class SuiviIntrouvableException extends RuntimeException {
    public SuiviIntrouvableException(String s) {
        super(s);
    }
}

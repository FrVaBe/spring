package de.frvabe.spring;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandling {

    // @ExceptionHandler(NotFoundException.class)
    // @ResponseBody
    // @ResponseStatus(value = HttpStatus.NOT_FOUND)
    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<String> handleIOException(IOException ex) {
        return new ResponseEntity<String>("Division by zero", HttpStatus.BAD_REQUEST);
    }

}

package com.example.simpleproject.dto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

@RestControllerAdvice
public class ExceptionHandlerResource {
    @ExceptionHandler
    public ResponseEntity<ResponseDto<List<ErrorDto>>> exceptionHandler(MethodArgumentNotValidException e) {
        return ResponseEntity.badRequest().body(ResponseDto.<List<ErrorDto>>builder()
                        .success(false)
                        .code(-1)
                        .message("validation error")
                        .data(e.getBindingResult().getFieldErrors().stream().map(fieldError -> {
                            String field = fieldError.getField();
                            String message = fieldError.getDefaultMessage();
                            String rejectionValue = String.valueOf(fieldError.getRejectedValue());
                            return new ErrorDto(field, String.format("message :: %s rejection :: %s", message, rejectionValue));
                        }).toList())
                .build());
    }
}
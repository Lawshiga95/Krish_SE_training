package com.lawshiga.exception;

public class IllegalAccessException extends RuntimeException{
    public IllegalAccessException(String message, Throwable exception) {
        super(message, exception);
    }
}

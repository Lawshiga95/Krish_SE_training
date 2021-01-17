package com.lawshiga.exception;

public class UserNotFoundException extends Exception{
    public UserNotFoundException(String message, Throwable exception) {
        super(message, exception);
    }
}

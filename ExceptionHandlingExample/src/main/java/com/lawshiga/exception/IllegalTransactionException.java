package com.lawshiga.exception;

public class IllegalTransactionException extends Exception{
    public IllegalTransactionException(String message, Throwable exception) {
        super(message, exception);
    }
}

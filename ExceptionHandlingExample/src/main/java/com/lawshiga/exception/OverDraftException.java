package com.lawshiga.exception;

public class OverDraftException extends RuntimeException{
    public OverDraftException(String message){
        super(message);
    }
}

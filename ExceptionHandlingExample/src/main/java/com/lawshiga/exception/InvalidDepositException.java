package com.lawshiga.exception;

public class InvalidDepositException extends RuntimeException{
    public InvalidDepositException(String message){
        super(message);
    }
}

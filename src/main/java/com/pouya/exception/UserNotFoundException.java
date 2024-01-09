package com.pouya.exception;

public class UserNotFoundException extends IllegalArgumentException{
    public UserNotFoundException() {
        super("The specified user does not exist.");
    }
}

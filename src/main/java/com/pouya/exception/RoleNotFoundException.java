package com.pouya.exception;

public class RoleNotFoundException extends IllegalArgumentException{
    public RoleNotFoundException() {
        super("The specified role does not exist.");
    }
}

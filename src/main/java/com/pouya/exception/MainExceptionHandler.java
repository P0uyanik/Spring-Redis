package com.pouya.exception;

import com.pouya.core.Role;
import com.pouya.core.User;

public class MainExceptionHandler {
    public static void checkingTheRole (Role role)
    {
        if(role == null)
            throw  new RoleNotFoundException() ;
    }

    public static void checkingTheUser(User user) {
        if(user == null)
            throw  new UserNotFoundException() ;
    }
}

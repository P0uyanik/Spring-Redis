package com.pouya.service;

import com.pouya.core.Role;
import com.pouya.core.User;
import com.pouya.dto.RoleDto;
import com.pouya.dto.UserDto;

public interface UserService {
    void addNewRole(RoleDto roleDto);

     void addNewUser(UserDto userDto , RoleDto roleDto ) ;

    User findUserByEmail(String email);

    Iterable<User> findAll();

    void updateUserInformation(UserDto userDto);

    Iterable<Role> showAllRoles();

}

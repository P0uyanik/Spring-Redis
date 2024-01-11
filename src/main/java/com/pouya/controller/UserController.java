package com.pouya.controller;
import com.pouya.core.Role;
import com.pouya.core.User;
import com.pouya.dto.RoleDto;
import com.pouya.dto.SignIn;
import com.pouya.dto.UserDto;
import com.pouya.service.UserService;
import lombok.RequiredArgsConstructor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/user")
@RequiredArgsConstructor
@Slf4j
public class UserController {
    private final UserService userService;

    @PostMapping("/new-role")
    public void addNewRole(@RequestBody RoleDto roleDto) {
        log.error("controller role {}", roleDto);
        userService.addNewRole(roleDto);
    }

    @GetMapping("/get-roles")
    public Iterable<Role> findRoles() {
        return userService.showAllRoles();
    }

    @PostMapping("/add-user")
    public void addNewUser(@RequestBody SignIn signIn) {
        userService.addNewUser(signIn.getUserDto(), signIn.getRoleDto());
    }


    @GetMapping("all-users")
    public Iterable<User> all() {
        return userService.findAll();
    }
    @GetMapping("/get-user")
    public User findUserByEmail(@RequestParam String email) {
        User user = userService.findUserByEmail(email);
        return user ;
    }

    @PutMapping("update-user-information")
    public void updateUserInformation(@RequestBody UserDto userDto) {
        userService.updateUserInformation(userDto);
    }

}

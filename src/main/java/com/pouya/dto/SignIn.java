package com.pouya.dto;

import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SignIn  {
private UserDto userDto ;
private  RoleDto roleDto ;
}

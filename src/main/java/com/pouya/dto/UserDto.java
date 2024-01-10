package com.pouya.dto;

import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserDto   {
    String name ;
    String lastname ;
    String email ;
    String password ;
}

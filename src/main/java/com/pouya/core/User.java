package com.pouya.core;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Reference;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@RedisHash
public class User implements Serializable  {
    @Id
    String id ;
    String name ;
    String lastname ;
    @Indexed
    String email ;
    String password  ;

    @Reference
    Set <Role> roles = new HashSet<Role>() ;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getSet() {
        return Collections.unmodifiableSet(this.roles);
    }

    public void setRole(Role role) {
        this.roles.add(role) ;
    }

}

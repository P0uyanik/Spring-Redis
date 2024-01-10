package com.pouya.service;

import com.pouya.core.Role;
import com.pouya.dto.RoleDto;

public interface RoleService {
    Role findByName(String name);

    void addNewRole(RoleDto roleDto);

    Iterable<Role> showAllRoles();

}

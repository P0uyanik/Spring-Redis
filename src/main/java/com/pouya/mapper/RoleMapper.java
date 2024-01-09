
package com.pouya.mapper;

import com.pouya.core.Role;
import com.pouya.dto.RoleDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RoleMapper  {
    RoleMapper INSTANCE = Mappers.getMapper(RoleMapper.class) ;
    RoleDto toRoleDto (Role role) ;
    Role toRole (RoleDto roleDto) ;
}


package com.pouya.mapper;

import com.pouya.core.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface UserToUserMapper {
    UserToUserMapper INSTANCE =  Mappers.getMapper(UserToUserMapper.class) ;
    User userWithoutIdToUserWithId (User user) ;
}


package com.pouya.mapper;
import com.pouya.core.User;
import com.pouya.dto.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper
public interface UserMapping {
    UserMapping INSTANCE =  Mappers.getMapper(UserMapping.class) ;
    UserDto toUserDto (User user) ;
    User toUser (UserDto userDto) ;
}



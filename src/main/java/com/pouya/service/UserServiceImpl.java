package com.pouya.service;
import com.pouya.core.Role;
import com.pouya.core.User;
import com.pouya.dto.RoleDto;
import com.pouya.dto.UserDto;
import com.pouya.exception.MainExceptionHandler;
import com.pouya.mapper.RoleMapper;
import com.pouya.mapper.UserMapping;
import com.pouya.mapper.UserToUserMapper;
import com.pouya.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final RoleServiceImpl roleService;
    UserMapping userMapping = UserMapping.INSTANCE;
    RoleMapper roleMapper = RoleMapper.INSTANCE;
    UserToUserMapper userToUserMapper = UserToUserMapper.INSTANCE;

    @Override
    public void addNewRole(RoleDto roleDto) {
        roleService.addNewRole(roleDto);
    }

    @Override
    public void addNewUser(UserDto userDto, RoleDto roleDto) {
        User user = userMapping.toUser(userDto);
        Role role = roleMapper.toRole(roleDto);
        Role roleByRole = findRoleByRole(role.getRole());
        user.setRole(roleByRole);
        userRepository.save(user);
    }

    @Override
    public User findUserByEmail(String email) {
        return userRepository.findFirstByEmail(email);
    }

    @Override
    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void updateUserInformation(UserDto userDto) {
        log.info("my Object {}", userDto);
        User user = userMapping.toUser(userDto);
        log.info("my Object {}", user.getEmail());
        User userByEmail = userRepository.findFirstByEmail(user.getEmail());
        MainExceptionHandler.checkingTheUser(userByEmail);
        User userForUpdate = userToUserMapper.userWithoutIdToUserWithId(user);
        userRepository.save(userForUpdate);
    }

    @Override
    public Iterable<Role> showAllRoles() {
        return roleService.showAllRoles();
    }

    private Role findRoleByRole(String role) {
        return roleService.findByName(role);
    }
}

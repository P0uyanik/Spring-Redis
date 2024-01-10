package com.pouya.service;
import com.pouya.core.Role;
import com.pouya.dto.RoleDto;
import com.pouya.exception.MainExceptionHandler;
import com.pouya.mapper.RoleMapper;
import com.pouya.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
@Slf4j
public class RoleServiceImpl implements  RoleService {
    private final RoleRepository roleRepository ;
    private final RoleMapper instance = RoleMapper.INSTANCE;
    @Override
    public Role findByName(String role) {
        Role roleByRole = roleRepository.findFirstByRole(role);
        MainExceptionHandler.checkingTheRole(roleByRole);
        return roleByRole ;
    }

    @Override
    public void addNewRole(RoleDto roleDto) {
        Role role = instance.toRole(roleDto);
        log.error("role  {}" , role);
        roleRepository.save(role) ;
    }

    @Override
    public Iterable<Role> showAllRoles() {
        return roleRepository.findAll();
    }
}

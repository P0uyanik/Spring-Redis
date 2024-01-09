package com.pouya.repository;
import com.pouya.core.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends CrudRepository<Role, String> {
    Role findRoleByRole(String name);
}

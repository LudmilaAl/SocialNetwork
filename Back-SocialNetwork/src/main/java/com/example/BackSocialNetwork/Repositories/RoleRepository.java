package com.example.BackSocialNetwork.Repositories;

import com.example.BackSocialNetwork.Entities.Role;
import com.example.BackSocialNetwork.Entities.RoleEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(RoleEnum roleName);
}

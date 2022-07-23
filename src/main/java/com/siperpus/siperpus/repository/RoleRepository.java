package com.siperpus.siperpus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siperpus.siperpus.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
    
}

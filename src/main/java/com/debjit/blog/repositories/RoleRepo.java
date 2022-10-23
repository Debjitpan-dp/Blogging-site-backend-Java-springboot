package com.debjit.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.debjit.blog.entities.Role;

public interface RoleRepo extends JpaRepository<Role, Integer> {

}

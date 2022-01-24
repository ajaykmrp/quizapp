package com.quiz.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.model.Role;

public interface RoleRepository extends JpaRepository<Role,Long> {
}

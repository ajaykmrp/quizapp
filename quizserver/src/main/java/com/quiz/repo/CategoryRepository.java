package com.quiz.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.model.exam.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}

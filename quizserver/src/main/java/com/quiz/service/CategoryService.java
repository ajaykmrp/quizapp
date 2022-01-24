package com.quiz.service;

import java.util.Set;

import com.quiz.model.exam.Category;

public interface CategoryService {
    public Category addCategory(Category category);

    public Set<Category> getCategories();

    public Category getCategory(Long categoryId);
    
    public Category updateCategory(Category category);

    public void deleteCategory(Long categoryId);
}

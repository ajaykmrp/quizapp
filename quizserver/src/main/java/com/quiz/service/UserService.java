package com.quiz.service;

import java.util.Set;

import com.quiz.model.User;
import com.quiz.model.UserRole;

public interface UserService {

    public User createUser(User user, Set<UserRole> userRoles) throws Exception;

    public User getUser(String username);

    public void deleteUser(Long userId);

	public User updateUser(User user);
}

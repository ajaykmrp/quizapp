package com.quiz.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.quiz.exception.UserFoundException;
import com.quiz.exception.UserNotFoundException;
import com.quiz.model.Role;
import com.quiz.model.User;
import com.quiz.model.UserRole;
import com.quiz.repo.RoleRepository;
import com.quiz.repo.UserRepository;
import com.quiz.service.UserService;

import java.util.Set;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    //creating user
    @Override
    public User createUser(User user, Set<UserRole> userRoles) throws Exception {


        User local = this.userRepository.findByUsername(user.getUsername());
        if (local != null) {
            System.out.println("User is already there !!");
            throw new UserFoundException();
        } else {
            //user create
            for (UserRole ur : userRoles) {
                roleRepository.save(ur.getRole());
            }

            user.getUserRoles().addAll(userRoles);
            local = this.userRepository.save(user);

        }

        return local;
    }

    //getting user by username
    @Override
    public User getUser(String username) {
        return this.userRepository.findByUsername(username);
    }

    @Override
    public void deleteUser(Long userId) {
        this.userRepository.deleteById(userId);
    }

	@Override
	public User updateUser(User user) {
		return this.userRepository.save(user);
	}

	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	


}

package com.quiz.test.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.quiz.model.User;
import com.quiz.repo.UserRepository;
import com.quiz.service.impl.UserServiceImpl;

@ExtendWith(MockitoExtension.class)
public class UserServiceImplTest {
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@Test
	void deleteUser() {
		User user = new User();
		user.setId(12L);
		user.setFirstName("Aman");
		user.setLastName("Patel");
		user.setEmail("aman@gmail.com");
		user.setPassword("aman@123");
		user.setUsername("aman001");
		user.setPhone("7896523669");
		
		userServiceImpl.deleteUser(12L);
		
		verify(userRepository, times(1)).delete(user);
	}
}

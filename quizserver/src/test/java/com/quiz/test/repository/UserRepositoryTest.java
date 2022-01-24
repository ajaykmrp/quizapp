package com.quiz.test.repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.quiz.model.Role;
import com.quiz.model.User;
import com.quiz.model.UserRole;
import com.quiz.repo.QuizRepository;
import com.quiz.repo.UserRepository;
import com.quiz.service.UserService;

@SpringBootTest
public class UserRepositoryTest {
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Test
	void findByUsernameTest() throws Exception {
		User user = new User();
//		user.setFirstName("Aman");
//		user.setLastName("Patel");
//		user.setEmail("aman@gmail.com");
//		user.setPassword(this.bCryptPasswordEncoder.encode("aman@123"));
//		user.setUsername("aman001");
//		user.setPhone("7896523669");
//		
//		this.userRepository.save(user);
		
		User u1 = userRepository.findByUsername("aman001");
		
		assertThat(user).isEqualTo(u1);
	}
	
}

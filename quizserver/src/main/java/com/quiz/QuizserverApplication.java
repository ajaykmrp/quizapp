package com.quiz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;

import com.quiz.exception.UserFoundException;
import com.quiz.model.Role;
import com.quiz.model.User;
import com.quiz.model.UserRole;
import com.quiz.model.exam.Quiz;
import com.quiz.repo.QuizRepository;
import com.quiz.service.UserService;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class QuizserverApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Autowired
	public QuizRepository quizRepository;

	public static void main(String[] args) {

		SpringApplication.run(QuizserverApplication.class, args);

	}

	/*  Add ADMIN Registration From here  */
	
	@Override
	public void run(String... args) throws Exception {
//		try {
//
//			System.out.println("starting code");
//
//			User user = new User();
//
//			user.setFirstName("Ajay");
//			user.setLastName("Patel");
//			user.setUsername("ajay00001");
//			user.setPassword(this.bCryptPasswordEncoder.encode("ajay@123"));
//			user.setEmail("ajay@gmail.com");
//			user.setPhone("7896547896");
//
//			Role role1 = new Role();
//			role1.setRoleId(101L);
//			role1.setRoleName("ADMIN");
//
//			Set<UserRole> userRoleSet = new HashSet<>();
//			UserRole userRole = new UserRole();
//
//			userRole.setRole(role1);
//
//			userRole.setUser(user);
//
//			userRoleSet.add(userRole);
//
//			User user1 = this.userService.createUser(user, userRoleSet);
//			System.out.println(user1.getUsername());
//
//		} catch (UserFoundException e) {
//			e.printStackTrace();
//		}
	}

}

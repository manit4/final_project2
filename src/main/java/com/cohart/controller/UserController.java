package com.cohart.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cohart.db.DBUtils;
import com.cohart.repository.UserRepository;
import com.cohart.service.UserService;
import com.cohart.to.User;

@Controller
public class UserController {
	
//	@RequestMapping(value = "/register", method = RequestMethod.POST)
//	public String register(String username, String password, String firstName, String lastName, String email) throws Exception {
//		System.out.println("inside register method.."+username+", "+password+", "+firstName+", "+lastName+", "+email);
//		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "root");
//		
//		PreparedStatement pstmt = conn.prepareStatement("insert into user values(?, ?, ?, ?, ?)");
//
//		pstmt.setString(1, username);
//		pstmt.setString(2, password);
//		pstmt.setString(3, firstName);
//		pstmt.setString(4, lastName);
//		pstmt.setString(5, email);
//		
//		pstmt.execute();
//		
//		return "index";
//	}
//	
//	@RequestMapping("/login")
//	public String login(String username, String password) throws Exception {
//		
//		System.out.println("The username is "+username+", the password is "+password);
//		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "root");
//		
//		PreparedStatement pstmt =  conn.prepareStatement("select * from user where username = ? and password = ?");
//		
//		pstmt.setString(1, username);
//		pstmt.setString(2, password);
//		
//		ResultSet rs = pstmt.executeQuery();
//		
//		if(rs.next()) {
//			return "welcomePage";
//		}
//		else {
//			return "index";
//		}	
//	}

	
//	@RequestMapping(value = "/register", method = RequestMethod.POST)
//	public String register(String username, String password, String firstName, String lastName, String email) throws Exception {
//		System.out.println("inside register method.."+username+", "+password+", "+firstName+", "+lastName+", "+email);
//		
//		Connection conn = DBUtils.getConnection();
//		
//		PreparedStatement pstmt = conn.prepareStatement("insert into user values(?, ?, ?, ?, ?)");
//
//		pstmt.setString(1, username);
//		pstmt.setString(2, password);
//		pstmt.setString(3, firstName);
//		pstmt.setString(4, lastName);
//		pstmt.setString(5, email);
//		
//		pstmt.execute();
//		
//		return "index";
//	}
//	
//	@RequestMapping("/login")
//	public String login(String username, String password) throws Exception {
//		
//		System.out.println("The username is "+username+", the password is "+password);
//		
//		Connection conn = DBUtils.getConnection();	
//		PreparedStatement pstmt =  conn.prepareStatement("select * from user where username = ? and password = ?");
//		
//		pstmt.setString(1, username);
//		pstmt.setString(2, password);
//		
//		ResultSet rs = pstmt.executeQuery();
//		
//		if(rs.next()) {
//			return "welcomePage";
//		}
//		else {
//			return "index";
//		}	
//	}
	
//	@RequestMapping(value = "/register", method = RequestMethod.POST)
//	public String register(String username, String password, String firstName, String lastName, String email) throws Exception {
//		System.out.println("inside register method.."+username+", "+password+", "+firstName+", "+lastName+", "+email);
//		
//		UserRepository userRepository = new UserRepository();
//		
//		userRepository.save(username, password, firstName, lastName, email);
//		
//		return "index";
//	}
//	
//	@RequestMapping("/login")
//	public String login(String username, String password) throws Exception {
//		
//		System.out.println("The username is "+username+", the password is "+password);
//		
//		UserRepository userRepository = new UserRepository();
//		
//		boolean validatedUserStatus = userRepository.validateUserCredentials(username, password);
//		
//		if(validatedUserStatus == true) {
//			return "welcomePage";
//		}
//		else {
//			return "index";
//		}	
//	}
	
//	@RequestMapping(value = "/register", method = RequestMethod.POST)
//	public String register(String username, String password, String firstName, String lastName, String email) throws Exception {
//		System.out.println("inside register method.."+username+", "+password+", "+firstName+", "+lastName+", "+email);
//		
//		UserRepository userRepository = new UserRepository();
//		
//		User user = new User(username, password, firstName, lastName, email);
//		
//		userRepository.save(user);
//		
//		//userRepository.save(username, password, firstName, lastName, email);
//		
//		return "index";
//	}
//	
//	@RequestMapping("/login")
//	public String login(String username, String password) throws Exception {
//		
//		System.out.println("The username is "+username+", the password is "+password);
//		
//		UserRepository userRepository = new UserRepository();
//		
//		boolean validatedUserStatus = userRepository.validateUserCredentials(username, password);
//		
//		if(validatedUserStatus == true) {
//			return "welcomePage";
//		}
//		else {
//			return "index";
//		}	
//	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(String username, String password, String firstName, String lastName, String email) throws Exception {
		System.out.println("inside register method.."+username+", "+password+", "+firstName+", "+lastName+", "+email);
		
		UserRepository userRepository = new UserRepository();
		
		User user = new User(username, password, firstName, lastName, email);
		
		userRepository.save(user);
		
		//userRepository.save(username, password, firstName, lastName, email);
		
		return "index";
	}
	
//	@RequestMapping("/login")
//	public String login(String username, String password) throws Exception {
//		
//		System.out.println("The username is "+username+", the password is "+password);
//		
//		UserService userService = new UserService();
//		
//		boolean validatedUserStatus = userService.validateUser(username, password);
//		
//		int i = 4;   int j = 5;
//				
//		if(validatedUserStatus == true) {
//			return "welcomePage";
//		}
//		else {
//			return "index";
//		}	
//	}
	
//	@RequestMapping("/login")
//	public ModelAndView login(String username, String password) throws Exception {
//		
//		System.out.println("The username is "+username+", the password is "+password);
//		
//		UserService userService = new UserService();
//		
//		boolean validatedUserStatus = userService.validateUser(username, password);
//		
//		int i = 4;   int j = 5;
//				
//		if(validatedUserStatus == true) {
//			
//			ModelAndView modelAndView = new ModelAndView("welcomePage");
//			
//			modelAndView.addObject("value1", i);
//			modelAndView.addObject("value2", j);
//			
//			return modelAndView;
//		}
//		else {
//			ModelAndView modelAndView = new ModelAndView("index");
//			modelAndView.addObject("loginErrorMessage", "Incorrect Credentials, please try again!!");
//			
//			return modelAndView;
//		}	
//	}
	
	@RequestMapping("/login")
	public ModelAndView login(String username, String password) throws Exception {
		
		System.out.println("The username is "+username+", the password is "+password);
		
		if(username.equals("") || password.equals("")) {//This would return the index or login page back to user if either username or
														//password or both are incorrect...
			
			ModelAndView modelAndView = new ModelAndView("index");
			modelAndView.addObject("loginErrorMessage", "Please do Not submit empty fields!!");
			
			return modelAndView;
		}
		
		UserService userService = new UserService();
		
		User user = userService.validateUser(username, password);
		
		if(user != null) {
			
			ModelAndView modelAndView = new ModelAndView("welcomePage");
			modelAndView.addObject("userData", user);
			return modelAndView;
		}
		else {
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("loginErrorMessage", "Incorrect Credentials, please try again!!");
		
		return modelAndView;
	}
		
		
				
//		if(validatedUserStatus == true) {
//			
//			ModelAndView modelAndView = new ModelAndView("welcomePage");
//			
//			return modelAndView;
//		}
//		else {
//			ModelAndView modelAndView = new ModelAndView("index");
//			modelAndView.addObject("loginErrorMessage", "Incorrect Credentials, please try again!!");
//			
//			return modelAndView;
//		}	
	}
	
}

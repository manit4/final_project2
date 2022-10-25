package com.cohart.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.cohart.db.DBUtils;
import com.cohart.to.User;

public class UserRepository {

//	public void save(String username, String password, String firstName, String lastName, String email) throws Exception {
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
//	}
	
//	public boolean validateUserCredentials(String username, String password) throws Exception {
//		
//		boolean loginStatus = false;
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
//			loginStatus = true;
//		}
//		return loginStatus;
//	}

	public void save(User user) throws Exception {

		Connection conn = DBUtils.getConnection();

		PreparedStatement pstmt = conn.prepareStatement("insert into user values(?, ?, ?, ?, ?)");

		pstmt.setString(1, user.getUsername());
		pstmt.setString(2, user.getPassword());
		pstmt.setString(3, user.getFirstName());
		pstmt.setString(4, user.getLastName());
		pstmt.setString(5, user.getEmail());

		pstmt.execute();
	}
	
public User validateUserCredentials(String username, String password) throws Exception {
		
		//boolean loginStatus = false;
		User user = null;
		
		Connection conn = DBUtils.getConnection();	
		PreparedStatement pstmt =  conn.prepareStatement("select * from user where username = ? and password = ?");
		
		pstmt.setString(1, username);
		pstmt.setString(2, password);
		
		ResultSet rs = pstmt.executeQuery();
		
//		if(rs.next()) {
//			loginStatus = true;
//		}
//		if(rs.next()) {
//			String uname = rs.getString(1);
//			String pwd = rs.getString(2);
//			String fName = rs.getString(3);
//			String lName =rs.getString(4);
//			String emailAddress = rs.getString(5);
//			
//			user = new User(uname, password, fName, lName, emailAddress);
//		}
		
		if(rs.next()) {
			username = rs.getString(1);
			password = rs.getString(2);
			String fName = rs.getString(3);
			String lName =rs.getString(4);
			String emailAddress = rs.getString(5);
			
			user = new User(username, password, fName, lName, emailAddress);
		}
		
		return user;
	}

	public List<User> getUsers() throws Exception {
		
		List<User> users = new ArrayList<User>();
		
		Connection conn = DBUtils.getConnection();	
		PreparedStatement pstmt =  conn.prepareStatement("select * from user");
		
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			
			String username = rs.getString(1);
			String password = rs.getString(2);
			String fName = rs.getString(3);
			String lName =rs.getString(4);
			String emailAddress = rs.getString(5);
			
			User user = new User(username, password, fName, lName, emailAddress);
			users.add(user);
		}
		
		return users;
		
	}

}

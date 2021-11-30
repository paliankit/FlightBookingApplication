package com.flightapp.admin.service.services;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		// fetch user from database
		
		if ("demo".equals(username)) {
//			return new User("demo", "{noop}demo@123", new ArrayList<>());
//			return new User("demo", "{bcrypt}$2a$10$cDFBrLxg6dGWvYDpGNkSUeIesYElOzx6QsmgsIUQp8JbTQpVpjbEa", new ArrayList<>());
			return new User("demo", "$2a$10$cDFBrLxg6dGWvYDpGNkSUeIesYElOzx6QsmgsIUQp8JbTQpVpjbEa", new ArrayList<>());
		} else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
	}
}
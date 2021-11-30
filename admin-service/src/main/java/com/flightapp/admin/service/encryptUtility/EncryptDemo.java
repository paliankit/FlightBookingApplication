package com.flightapp.admin.service.encryptUtility;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class EncryptDemo {

	public static void main(String[] args) {
		PasswordEncoder encoder = new BCryptPasswordEncoder();
		
		String encodedStr = encoder.encode("demo@123");
		System.out.println(encodedStr);
		
		System.out.println("Match(demo@1234): "+encoder.matches("demo@1234", encodedStr));
		System.out.println("Match(demo@123): "+encoder.matches("demo@123", encodedStr));
	}
	
}

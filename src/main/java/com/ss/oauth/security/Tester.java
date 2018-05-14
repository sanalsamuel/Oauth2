package com.ss.oauth.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Tester {
	
	public static void main(String[] args) {
		
		
		 System.out.println("TESTER");
		
		  BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

		  System.out.println(bCryptPasswordEncoder.encode("tester"));
		  
		  System.out.println(bCryptPasswordEncoder.matches("tester", "$2a$10$jyl1GJTKmpDyR/6KEbBjg.MINhyDfmVtm1NT8fJFUMAXco5Esz3l."));

}
	
}

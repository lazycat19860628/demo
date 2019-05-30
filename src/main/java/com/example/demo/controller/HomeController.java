package com.example.demo.controller;

import java.util.List;

import com.example.demo.dao.AuthService;
import com.example.demo.util.JwtAuthenticationResponse;
import com.example.demo.util.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.domain.Person;
import com.example.demo.repository.PersonRepository;

@RestController
public class HomeController {
	@Autowired
	PersonRepository personRepository;
	@Autowired
	private UserDetailsService userDetailsService;
	@Autowired
	private AuthService authService;
	@CrossOrigin
	@RequestMapping("/")
	public ResponseEntity<?> createAuthenticationToken(
			// String username,String password
	) throws AuthenticationException {
		//  @RequestBody JwtAuthenticationRequest authenticationRequest
		final String token = authService.login();

		// Return the token
		return ResponseEntity.ok(new JwtAuthenticationResponse(token));
	}
}

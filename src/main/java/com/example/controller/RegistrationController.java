package com.example.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Registration;
import com.example.service.RegistrationInterface;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@CrossOrigin(origins="http://localhost:3000/")
public class RegistrationController {
	@Autowired
	private RegistrationInterface registrationInterface;
	
	@PostMapping("/register")
	public Registration addRegistraion(  @RequestBody Registration registration) {
		return registrationInterface.addRegistration(registration);
	}
}

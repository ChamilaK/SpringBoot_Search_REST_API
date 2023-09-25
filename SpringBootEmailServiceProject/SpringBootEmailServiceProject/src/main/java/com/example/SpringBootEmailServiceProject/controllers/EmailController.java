package com.example.SpringBootEmailServiceProject.controllers;

import java.util.List;

import com.example.SpringBootEmailServiceProject.beans.Email;
import com.example.SpringBootEmailServiceProject.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
	
	@Autowired
	EmailService emailService;
	
	// To get the list of all the emails from the database table
	@GetMapping("/getemails")
	public List<Email> getEmails()
	{
		return emailService.getAllEmails();
	}
	
	// To get the list of emails match with the given word or sentence
	@GetMapping("/getemails/subject")
	public ResponseEntity<List<Email>> getEmailBySubject(@RequestParam("query")String query)
	{
			return ResponseEntity.ok(emailService.getEmailBySubject(query));

	}

}


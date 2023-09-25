package com.example.SpringBootEmailServiceProject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.SpringBootEmailServiceProject.beans.Email;
import com.example.SpringBootEmailServiceProject.repositories.EmailRepository;

@Component
@Service
public class EmailService {
	
	@Autowired
	EmailRepository emailrep;
	
	public List<Email> getAllEmails()
	{
		return emailrep.findAll();
	}
	
	public List<Email> getEmailBySubject(String query)
	{
		List<Email> emails=emailrep.getEmailBySubjectSQL(query);
		return emails;
			
	}

}

package com.example.Email.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Email.Dto.EmailDto;
import com.example.Email.Service.EmailService;

@RestController
public class EmailController {

	@Autowired
	private EmailService emailservice;
	
	
	@PostMapping("/mails")
	public void EmailSending (@RequestBody EmailDto emaildto)
	{
		emailservice.EmailSending(emaildto);
	}
}

package com.example.Email.Service;

import javax.validation.constraints.Email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.example.Email.Dto.EmailDto;
import com.example.Email.Model.EmailModel;
import com.example.Email.Repository.EmailRepo;

@Service
public class EmailService {

	@Autowired
	private EmailRepo emailrepo;
	
	 JavaMailSender javamailSender;
	 
	 public EmailService ( JavaMailSender javamailSender)
	 {
		 this.javamailSender=javamailSender;
	 }
	
	public void EmailSending (EmailDto emaildto) throws MailException
	
	{
		EmailModel emailmodel = new EmailModel();
		emailmodel.seteMail(emaildto.geteMail());
		emailmodel.setName(emaildto.getName());
		
		emailrepo.save(emailmodel);
		
		
	     SimpleMailMessage mail = new SimpleMailMessage();
		mail.setTo(emaildto.geteMail());
		mail.setFrom("dimpalbhatia31@gmail.com");
		mail.setSubject("Hi" +emaildto.getName());
		mail.setText("HI THIS IS MY FIRST EMAIL THROUGH SPRING BOOT"   
		+"email" +emaildto.geteMail()     
		+"Name" +emaildto.getName());
		
		javamailSender.send(mail);
	
	}
	
	
}

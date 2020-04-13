package com.eas.msg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.eas.msg.service.EmailService;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
    private EmailService emailService;
 
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
     
    @Override
    public void run(String... args) 
    {
        emailService.sendMail("ramayan.dev@gmail.com", "Hi", "Application Main class sent you mail ---> 1...!!!");
         
        emailService.sendPreConfiguredMail("Application sent you mail ---->2  ::: PreConfiguredMail...!!!");
    }
	
}

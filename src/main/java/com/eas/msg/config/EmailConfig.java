package com.eas.msg.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.SimpleMailMessage;
 
@Configuration
public class EmailConfig 
{
    @Bean
    public SimpleMailMessage emailTemplate()
    {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("ramayan.dev@gmail.com");
        message.setFrom("ramayan.dev@gmail.com");
        message.setSubject("Test email");
        message.setText("Application sent you mail...!!!");
        return message;
    }
}
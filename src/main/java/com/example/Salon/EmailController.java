package com.example.Salon;

import com.example.Salon.Repository.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmailController {

    @Autowired
    private EmailService emailRepository;

    @GetMapping("/send-email")
    public String sendEmail(@RequestParam String toEmail, @RequestParam String subject, @RequestParam String body) {
        emailRepository.sendSimpleEmail(toEmail, subject, body);
        return "Email sent successfully";
    }
}

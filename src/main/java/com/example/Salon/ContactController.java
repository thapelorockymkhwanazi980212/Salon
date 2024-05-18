package com.example.Salon;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactController {

    @GetMapping("/contact")
    public String showContactPage() {
        return "contact"; // Assuming "contact.html" is in src/main/resources/templates
    }
}

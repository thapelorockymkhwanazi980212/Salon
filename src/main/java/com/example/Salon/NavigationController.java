package com.example.Salon;

import com.example.Salon.Repository.ClientRepository;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.io.IOException;

@Controller
public class NavigationController
{
    @Autowired
    private ClientRepository clientRepository;

    @GetMapping("/logout")
    public String logout()
    {

        return "create_account";
    }

    @GetMapping("/view_appointments")
    public String viewAppointments() {
        // Logic to fetch appointments data and render the appointments view
        return "view_appointments"; // Assuming "view_appointments" is the name of your Thymeleaf template
    }

    @GetMapping("/update_profile")
    public String updateProfile()
    {

        // Logic to fetch appointments data and render the appointments view
        return "update_profile"; // Assuming "view_appointments" is the name of your Thymeleaf template
    }

}

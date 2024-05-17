package com.example.Salon;

import com.example.Salon.Models.Client;
import com.example.Salon.Models.User;
import com.example.Salon.Repository.ClientRepository;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.io.IOException;
import java.util.Optional;

@Controller
public class NavigationController
{
    @Autowired
    private ClientRepository clientRepository;


    @GetMapping("/logout")
    public String getlogout()
    {


        return "create_account";
    }

    @GetMapping("/view_appointments")
    public String viewAppointments()
    {


        return "view_appointments"; // Assuming "view_appointments" is the name of your Thymeleaf template
    }

    @GetMapping("/update_profile")
    public String getUpdateProfile(@ModelAttribute User user)
    {

        return "update_profile"; // Assuming "view_appointments" is the name of your Thymeleaf template
    }

    @GetMapping("/gallery")
    public String getGallery()
    {

        return "gallery";
    }

    @GetMapping("/home")
    public String getHome()
    {

        return "home_page";
    }

}

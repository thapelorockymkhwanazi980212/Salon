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
    public String getLogout()
    {


        return "redirect:/";
    }

    @GetMapping("/view_appointments")
    public String viewAppointments()
    {


        return "view_appointments";
    }

    @GetMapping("/update_profile")
    public String getUpdateProfile(@ModelAttribute User user)
    {

        return "update_profile";
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

    @GetMapping("/about_us")
    public String getAboutUs()
    {

        return "about_us";
    }

    //admin mappings
    @GetMapping("/clients_list")
    public String getClientsList()
    {

        return "clients_list";
    }

    @GetMapping("/appointments_list")
    public String getAppointmentsList()
    {

        return "redirect:/all_bookings";
    }

}

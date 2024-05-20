package com.example.Salon;

import ch.qos.logback.core.model.Model;
import com.example.Salon.Models.Bookings;
import com.example.Salon.Models.Client;
import com.example.Salon.Models.User;
import com.example.Salon.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

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
    public String getClientList(org.springframework.ui.Model model) {
        List<Client> clients = clientRepository.findAll();
        model.addAttribute("clients", clients);

        return "clients_list";
    }
    @GetMapping("/appointments_list")
    public String getAppointmentsList()
    {

        return "redirect:/all_bookings";
    }

    @GetMapping("/services")
    public String getServices()
    {

        return "services";
    }
}

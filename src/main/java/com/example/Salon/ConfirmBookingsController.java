package com.example.Salon;

import com.example.Salon.Models.Client;
import com.example.Salon.Repository.ClientRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ConfirmBookingsController
{
    private ClientRepository clientRepository;

    @GetMapping("/confirmed_booking")
    public String confirm(Model model)
    {
        List<Client> clients = clientRepository.findAll();
        Client client = new Client();
        model.addAttribute("clients", clients);
        //model.addAttribute("client", client);

        return "booking_confirmed";

    }

    @PostMapping("/confirmed_booking")
    public String userLoginPage()
    {

        return "booking_confirmed";
    }
}

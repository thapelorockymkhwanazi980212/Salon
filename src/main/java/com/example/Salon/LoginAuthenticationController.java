package com.example.Salon;

import com.example.Salon.Models.Client;
import com.example.Salon.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class LoginAuthenticationController
{
    @Autowired
    private ClientRepository clientRepository;

    @GetMapping("/login_authentication")
   public String userLogin(Model model)
   {
        return "home_page";
   }


}

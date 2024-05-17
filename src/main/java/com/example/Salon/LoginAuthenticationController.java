package com.example.Salon;

import com.example.Salon.Models.Client;
import com.example.Salon.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.Query;
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


    @PostMapping("/login_authentication")
   public String loginAuthentication( @RequestParam("email_address") String email_address, @RequestParam("password") String password)
   {
//      Client client =  clientRepository.findByEmail(email_address);
//      String page = "home_page";

//      if(client.getEmail().equals(email_address))
//      {
//          if(password.equals(client.getPassword()))
//          {
//              page = "home_page";
//          }
//      }
        //model.addAttribute("error_message", "Incorrect username or password");
        return "home_page";
   }


}

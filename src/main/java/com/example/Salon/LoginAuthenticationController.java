package com.example.Salon;

import com.example.Salon.Models.Client;
import com.example.Salon.Models.User;
import com.example.Salon.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class LoginAuthenticationController
{
    @Autowired
    private ClientRepository clientRepository;


    @PostMapping("/login_authentication")
   public String loginAuthentication(@ModelAttribute User user, Model model)
   {
       String page = "client_login2";

       Client client = new Client();
       client.setEmail(user.getEmail());

       Example<Client> example = Example.of(client);
       Optional<Client> clientOptional = clientRepository.findOne(example);

       if(clientOptional.isPresent())
       {
            if(clientOptional.get().getPassword().equals(user.getPassword()))
           {
               page = "home_page";
           }
       }

       //use to code for daabase
//
//       Client client = new Client();
//       client.setEmail(clientOptional.get().getEmail());
//       client.setName(clientOptional.get().getName()) ;

        model.addAttribute("error_message", "Incorrect username or password");
        return page;
   }


}

package com.example.Salon;

import com.example.Salon.Models.Client;
import com.example.Salon.Models.User;
import com.example.Salon.Repository.ClientRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class PasswordController
{

    @Autowired
    private ClientRepository clientRepository;


    @PostMapping("/change_password")
    public String checkEmail(@ModelAttribute User user, Model model, HttpSession session)
    {
        String page = "forgotPassword";

        Client client = new Client();
        client.setEmail(user.getEmail());

        Example<Client> example = Example.of(client);
        Optional<Client> clientOptional = clientRepository.findOne(example);


        if(clientOptional.isPresent())
        {
//            if(clientOptional.get().getPassword().equals(user.getPassword()))
//            {
//                page = "home_page";
//            }
//            else
//            {
//                model.addAttribute("errorMessage", "Invalid username or password.");
//            }
            page = "reset_password";
        }

        return page;
    }

    @GetMapping("/password_updater")
    public String getPasswordUpdatePage (Model model, @RequestParam(required = false) String error)
    {
//            User user = new User();
//            user.setUsername("admin");
//            user.setPassword("admin");
//            user.setEmail("admin@gmail.com");

        if (error != null) {
            model.addAttribute("errorMessage", "Invalid username or password.");
        }

        model.addAttribute("user", new User());

        return "forgotPassword";
    }

    @PostMapping("/update_password")
    public String updatePassword(@ModelAttribute User user, Model model, HttpSession session)
    {


        Client client = new Client();

        Example<Client> example = Example.of(client);
        Optional<Client> clientOptional = clientRepository.findOne(example);


        if(clientOptional.isPresent())
        {
//            if(clientOptional.get().getPassword().equals(user.getPassword()))
//            {
//                page = "home_page";
//            }
//            else
//            {
//                model.addAttribute("errorMessage", "Invalid username or password.");
//            }
            page = "reset_password";
        }

}

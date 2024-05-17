package com.example.Salon;

import com.example.Salon.Models.Client;
import com.example.Salon.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;

@Controller
public class RegisterUserController
{
    @Autowired
    private ClientRepository clientRepository;

    @GetMapping("/")
    public String getCreateAccount(Model model)
    {
        model.addAttribute("client", new Client());
        return "create_account";
    }

    @GetMapping("/register_successful")
    public String userAdded(Model model)
    {
        model.addAttribute("client", new Client());
        return "home_page";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute Client client, Model model)
    {
        clientRepository.save(client);
        List<Client> clientList = clientRepository.findAll();
        model.addAttribute("client", new Client());
        model.addAttribute("clientList", clientList);

        return "client_login";
    }


//    @GetMapping("/list_clients")
//    public String ListUsers(Model model)
//    {
//        //create a list of clients tse otlo di bontshang ko the view page
//        List<Client> clients = clientRepository.findAll();
//
//        //ke add the attribute 'client' which is a new client that has those attributes bo (name, surname)
//        model.addAttribute("client", new Client());
//        return "list_clients";
//    }

    //controller for user login
    @GetMapping("/user_login_page")
        public String userLoginPage()
        {
            return "client_login";
        }



}

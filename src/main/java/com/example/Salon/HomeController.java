package com.example.Salon;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController
{
    @GetMapping("/home_page")
    public String checkLogins(@RequestParam String email, @RequestParam String password, Model model)
    {
        //EDITED
        return "home_page";
    }
}

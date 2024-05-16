package com.example.Salon;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ConfirmBookingsController
{
    @PostMapping("/confirmed_booking")
    public String userLoginPage()
    {

        return "booking_confirmed";
    }
}

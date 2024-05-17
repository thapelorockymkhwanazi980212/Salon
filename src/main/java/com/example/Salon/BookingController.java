package com.example.Salon;

import com.example.Salon.Models.Bookings;
import com.example.Salon.Repository.BookingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookingController
{
    @Autowired
    private BookingsRepository bookingsRepository;


    @GetMapping("/booking")
    public String userLoginPage(@ModelAttribute Bookings bookings, Model model)
    {
        model.addAttribute("bookings", new Bookings());
        return "bookings";
    }


    @PostMapping("/confirm_booking")
    public String userLoggedIn(@ModelAttribute Bookings bookings)
    {
        //bookingsRepository.save(bookings);

        return "booking_confirmed";
    }

}

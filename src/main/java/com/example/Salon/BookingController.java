package com.example.Salon;


import com.example.Salon.Models.Bookings;
import com.example.Salon.Repository.BookingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BookingController {

    @Autowired
    private BookingsRepository bookingsRepository;

    @GetMapping("/booking_view")
    public String bookingPage(Model model) {
        model.addAttribute("bookings", new Bookings());
        return "bookings_page";
    }

    @PostMapping("/confirm_booking")
    public String confirmBooking(@ModelAttribute Bookings bookings, Model model) {
        bookingsRepository.save(bookings);
        return "redirect:/booking_confirmed";
    }

    @GetMapping("/booking_confirmed")
    public String bookingConfirmed(Model model) {
        return "booking_confirmed";
    }

    @GetMapping("/all_bookings")
    public String allBookings(Model model) {
        List<Bookings> bookings = bookingsRepository.findAll();
        model.addAttribute("bookings",bookings );

        return "all_bookings_page";
    }
}

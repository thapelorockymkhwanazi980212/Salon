package com.example.Salon;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.io.IOException;

@Controller
public class NavigationController
{

    @GetMapping("/logout")
    public String logout(Model model, HttpServletResponse response) throws IOException
    {

        response.setHeader(HttpHeaders.CACHE_CONTROL, "no-cache, no-store, must-revalidate");
        response.setHeader(HttpHeaders.PRAGMA, "no-cache");
        response.setHeader(HttpHeaders.EXPIRES, "0");
        response.sendRedirect("home_page");

        return "home_page";
    }

    @GetMapping("/view_appointments")
    public String viewAppointments() {
        // Logic to fetch appointments data and render the appointments view
        return "view_appointments"; // Assuming "view_appointments" is the name of your Thymeleaf template
    }

    @GetMapping("/view_appointments")
    public String updateProfile()
    {
        // Logic to fetch appointments data and render the appointments view
        return "update_profile"; // Assuming "view_appointments" is the name of your Thymeleaf template
    }

}

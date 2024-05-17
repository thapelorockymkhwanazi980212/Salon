package com.example.Salon.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Date;

@Document
public class Bookings {

    @Id
    private String id;
    private String name;
    private String surname;
    private String hairstyle;
    private LocalDate bookingDate;
    private String comment;

    public Bookings() {
    }

    public Bookings(String hairstyle, String name, String surname, LocalDate bookingDate, String comment) {
        this.hairstyle = hairstyle;
        this.name = name;
        this.surname = surname;
        this.bookingDate = bookingDate;
        this.comment = comment;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getHairstyle() {
        return hairstyle;
    }

    public void setHairstyle(String hairstyle) {
        this.hairstyle = hairstyle;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}

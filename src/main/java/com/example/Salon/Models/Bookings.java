package com.example.Salon.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class Bookings
{
   @Id
    private String id;
    private String name;
    private String Surname;
    private String hairstyle;
    private Date bookingDate;
    private String comment;

    public Bookings() {
    }

    public Bookings(String hairstyle, String name, String surname, Date bookingDate, String comment) {
        this.hairstyle = hairstyle;
        this.name = name;
        Surname = surname;
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
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getHairstyle() {
        return hairstyle;
    }

    public void setHairstyle(String hairstyle) {
        this.hairstyle = hairstyle;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}

package com.example.Salon.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
    public class Book
{
        @Id
        private String id;
        private String title;
        private String author;
        private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    // Default constructor
        public Book() {}

        // Parameterized constructor
        public Book(String title, String author, Date date) {
            this.title = title;
            this.author = author;
            this.date = date;
        }

        // Getter and Setter for id
        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        // Getter and Setter for title
        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        // Getter and Setter for author
        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

}

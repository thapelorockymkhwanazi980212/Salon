package com.example.Salon.Repository;

import com.example.Salon.Models.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String>
{

}

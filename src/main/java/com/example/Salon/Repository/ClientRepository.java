package com.example.Salon.Repository;

import com.example.Salon.Models.Client;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface ClientRepository extends MongoRepository<Client, String>
{
    Client findByEmail(String email);
}

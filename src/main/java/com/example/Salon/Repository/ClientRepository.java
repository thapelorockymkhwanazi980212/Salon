package com.example.Salon.Repository;

import com.example.Salon.Models.Client;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClientRepository extends MongoRepository<Client, String>
{

}

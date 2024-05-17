package com.example.Salon.Repository;

import com.example.Salon.Models.Bookings;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookingsRepository extends MongoRepository<Bookings, String>
{

}

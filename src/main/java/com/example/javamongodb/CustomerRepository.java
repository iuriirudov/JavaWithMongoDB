package com.example.javamongodb;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * CustomerRepository
 */
public interface CustomerRepository extends MongoRepository<Customer, String> {

    public Customer findByFirstName(String firstName);

    public List<Customer> findByLastName(String lastName);
}

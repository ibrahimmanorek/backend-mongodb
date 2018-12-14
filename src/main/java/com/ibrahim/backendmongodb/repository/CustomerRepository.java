package com.ibrahim.backendmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ibrahim.backendmongodb.model.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, Integer> {

}

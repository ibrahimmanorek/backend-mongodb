package com.ibrahim.backendmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ibrahim.backendmongodb.model.Order;


@Repository
public interface OrderRepository extends MongoRepository<Order, Integer> {

}

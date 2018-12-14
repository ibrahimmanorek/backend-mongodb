package com.ibrahim.backendmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ibrahim.backendmongodb.model.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, Integer> {

}

package com.ibrahim.backendmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ibrahim.backendmongodb.model.OrderDetail;


@Repository
public interface OrderDetailRepository extends MongoRepository<OrderDetail, Integer> {

}

package com.ibrahim.backendmongodb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ibrahim.backendmongodb.model.ShippingMetods;

public interface ShippingMethodsRepository extends MongoRepository<ShippingMetods, String> {
}
package com.ibrahim.backendmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ibrahim.backendmongodb.model.Employee;


@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Integer> {

}

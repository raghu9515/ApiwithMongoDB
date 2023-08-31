package com.example.Apiwithatlasamigos;

import lombok.NonNull;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface CustomerRepository extends MongoRepository<Customer,String> {

@Query
    List<Customer> findAllByName(String name);
}

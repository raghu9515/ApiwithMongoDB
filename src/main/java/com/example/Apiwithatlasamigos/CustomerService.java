package com.example.Apiwithatlasamigos;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public String save(Customer customer){
        return customerRepository.save(customer).getId();
    }

    public Optional<Customer> getCustomerName(String id){
        return customerRepository.findById(id);
    }

public Optional<List<Customer>> getCustomerNameByName(String name){
        return Optional.of(customerRepository.findAllByName(name));
}


    public List<Customer> getAllCustomer(){
        return customerRepository.findAll();
    }
}

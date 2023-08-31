package com.example.Apiwithatlasamigos;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
@AllArgsConstructor
public class CustomerController {

    private final CustomerService customerService;
    @PostMapping
    public String save(@RequestBody Customer customer){
        return customerService.save(customer);
    }
    @GetMapping("/id")
    public Optional<Customer> getCustomer(@RequestParam("id") String id){
        return customerService.getCustomerName(id);
    }
    @GetMapping("/name")
    public Optional<List<Customer>> getCustomerByName(@RequestParam("name") String name){
        return customerService.getCustomerNameByName(name);
    }

@GetMapping
    public List<Customer> fetchAllCustomer(){
        return customerService.getAllCustomer();

    }
}

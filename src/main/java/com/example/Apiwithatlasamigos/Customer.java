package com.example.Apiwithatlasamigos;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Customer {

    @Id
    private String id;

    private String name;
    private String surname;
    private long number;

    public Customer(String name, String surname, long number) {
        this.name = name;
        this.surname = surname;
        this.number = number;
    }
}

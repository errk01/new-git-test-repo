package com.example.tts.demoSpringIntro.repository;

import com.example.tts.demoSpringIntro.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepo extends CrudRepository<Customer, Long> {
    List<Customer> findByLastName(String lastName);
}

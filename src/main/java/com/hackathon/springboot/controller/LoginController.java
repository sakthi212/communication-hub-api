package com.hackathon.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.springboot.cruddemo.entity.Customer;
import com.hackathon.springboot.repository.CustomerRepository;

@RestController
public class LoginController {

    @Autowired
    private CustomerRepository customerRepository;

	/*
	 * @RequestMapping("/user") public Customer
	 * getUserDetailsAfterLogin(Authentication authentication) { List<Customer>
	 * customers = customerRepository.findByEmail(authentication.getName()); if
	 * (customers.size() > 0) { return customers.get(0); } else { return null; }
	 * 
	 * }
	 */

}

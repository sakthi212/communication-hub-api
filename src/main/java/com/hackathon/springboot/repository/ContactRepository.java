package com.hackathon.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hackathon.springboot.cruddemo.entity.Contact;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {
	
	
}

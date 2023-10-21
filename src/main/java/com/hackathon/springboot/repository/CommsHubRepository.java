package com.hackathon.springboot.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hackathon.springboot.cruddemo.entity.CommsHub;

@Repository
public interface CommsHubRepository extends CrudRepository<CommsHub, Long> {

	List<CommsHub> findByCustomerId(String customerId);
	List<CommsHub> findByFirstName(String firstName);
	List<CommsHub> findByLastName(String lastName);

}

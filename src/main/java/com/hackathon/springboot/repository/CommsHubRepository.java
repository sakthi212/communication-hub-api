package com.hackathon.springboot.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hackathon.springboot.cruddemo.entity.CommsHub;

@Repository
public interface CommsHubRepository extends CrudRepository<CommsHub, Long> {

	List<CommsHub> findByCustomerIdAndFirstNameAndLastName(@Param("customerId") String customerId,@Param("firstName") String firstName,@Param("lastName") String lastName);
	
	List<CommsHub> findByCustomerIdOrFirstNameOrLastName(@Param("customerId") String customerId,@Param("firstName") String firstName,@Param("lastName") String lastName);
	
}

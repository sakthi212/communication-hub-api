package com.hackathon.springboot.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hackathon.springboot.cruddemo.entity.Loans;

@Repository
public interface LoanRepository extends CrudRepository<Loans, Long> {

	// @PreAuthorize("hasRole('USER')")
	List<Loans> findByCustomerIdOrderByStartDtDesc(int customerId);

}

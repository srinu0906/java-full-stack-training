package com.srinu.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.srinu.entity.Customer;


public interface CustomerRepository extends JpaRepository<Customer,Long> {

	Customer findByEmail(String email);
	
}

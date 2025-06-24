package com.srinu.service;

import com.srinu.entity.Customer;



public interface CustomerService {
	
	Customer register(Customer customer);
	Customer login(String email, String password);
	Customer deposit(Long id, double amount);
	Customer withdraw(Long id, double amount);
		
}

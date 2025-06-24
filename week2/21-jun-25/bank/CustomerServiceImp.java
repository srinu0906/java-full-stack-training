package com.srinu.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srinu.Repository.CustomerRepository;
import com.srinu.entity.Customer;
import com.srinu.service.CustomerService;

@Service
public class CustomerServiceImp implements CustomerService{
	
	@Autowired
	private CustomerRepository repo;

	@Override
	public Customer register(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer login(String email, String password) {
		Customer customer = repo.findByEmail(email);
		if(customer != null && customer.getPassword().equals(password)) {
			return customer;
		}
		return null;
	}

	@Override
	public Customer deposit(Long id, double amount) {
		
		Customer customer = repo.findById(id).orElse(null);
		if(customer != null) {
			customer.setBalance(customer.getBalance() + amount);
		}
		return customer;
	}

	@Override
	public Customer withdraw(Long id, double amount) {
		Customer customer = repo.findById(id).orElse(null);
		if(customer != null) {
			customer.setBalance(customer.getBalance() - amount);
		}
		return customer;
	}

}

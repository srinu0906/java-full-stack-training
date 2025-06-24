package com.srinu.controller;

//import org.hibernate.mapping.Map;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srinu.entity.Customer;
import com.srinu.service.CustomerService;

@RestController
@RequestMapping("api/customer")
@CrossOrigin(origins = "*")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/register")
	public ResponseEntity<Customer> register(@RequestBody Customer  customer){
		return ResponseEntity.ok(customerService.register(customer));
	}
	
	@PostMapping("/login")
	public ResponseEntity<Customer> login(@RequestBody Map<String, String> creds){
		return ResponseEntity.ok(customerService.login(creds.get("email"), creds.get("password")));
	}
	
	@PostMapping("/deposit")
	public ResponseEntity<Customer> deposit(@RequestBody Map<String, String> data){
		
		Long id = Long.parseLong(data.get("id"));
		double amount = Double.parseDouble(data.get("amount"));
		return ResponseEntity.ok(customerService.deposit(id, amount));
	}
	
	@PostMapping("/withdraw")
	public ResponseEntity<Customer> withdraw(@RequestBody Map<String, String> data){
		
		Long id = Long.parseLong(data.get("id"));
		double amount = Double.parseDouble(data.get("amount"));
		return ResponseEntity.ok(customerService.withdraw(id, amount));
	}	
}

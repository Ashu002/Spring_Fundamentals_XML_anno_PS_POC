package com.pluralsight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;

/**
 * Created by ashutosh on 23/7/17.
 */
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {



	//Member Injection autowire
	//@Autowired
	private CustomerRepository customerRepository;

	//Constructor Injection autowire
	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository){
		System.out.println("using constructor injection");
		this.customerRepository = customerRepository;
	}
	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}


	//Setter injection autowire
	/*@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("We are using setter injection");
		this.customerRepository = customerRepository;
	}*/
}

package com.web.customer.tracker.Service;

import java.util.List;

import com.web.customer.tracker.domain.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);


	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);

	
	
	
}

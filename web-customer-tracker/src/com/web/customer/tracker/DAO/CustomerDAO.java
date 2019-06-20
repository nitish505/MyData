package com.web.customer.tracker.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.web.customer.tracker.domain.Customer;

@Repository
public interface CustomerDAO {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);
 
	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);
	
}

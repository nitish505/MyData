package com.web.customer.tracker.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.web.customer.tracker.domain.Customer;

@Repository
public class CustomerDaoImplmentation implements CustomerDAO {

	//for injection of sessionFactory
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	
	public List<Customer> getCustomers() {
		
		//getting the current session for implementation
		Session current_session=sessionFactory.getCurrentSession();
		
		//create a query
		Query<Customer> result_query=current_session.createQuery("from Customer order by lastname",Customer.class);
		
		//get result by executing query
		
		List<Customer> customers=result_query.getResultList();
		return customers;
	}


	@Override
	public void saveCustomer(Customer theCustomer) {
		//get current hibernate session for using
		
		Session current_session=sessionFactory.getCurrentSession();
		
		//now saving the customer detail to database
		
		current_session.saveOrUpdate(theCustomer);
	}


	@Override
	public Customer getCustomer(int theId) {
		//get current session
		
		Session current_session=sessionFactory.getCurrentSession();
		
		Customer thecustomer=current_session.get(Customer.class, theId);
		
		return thecustomer;
	
		
	}


	@Override
	public void deleteCustomer(int theId) {
	
		//get current hibernate session
		
		Session current_session=sessionFactory.getCurrentSession();
		Query thequery=current_session.createQuery("delete from Customer where id=:customerId");
		thequery.setParameter("customerId",theId);
		thequery.executeUpdate();
		
	}

}

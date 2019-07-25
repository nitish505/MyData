package com.web.customer.tracker.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.customer.tracker.Service.CustomerService;
import com.web.customer.tracker.domain.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	//for injecting customerService which used customerDAO----in controller class
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/list")
	public String listcustomer(Model model)
	{
		//get customer by using interface dao object
	List<Customer> theCustomer=customerService.getCustomers();
	
	//now add thecustomer object into spring mvc model
	model.addAttribute("customers", theCustomer);
	
		
		return "customers-list";
	}
	
@RequestMapping("/LoginServlet")
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
			
			String username=request.getParameter("uname");
			String password=request.getParameter("pass");
		
				if(username.equals("admin") && password.equals("adminadmin"))
				{
					
					response.sendRedirect("list");
					
				}
				else
				{
					//HttpSession session=request.getSession();
					//session.setAttribute("errorMessage", "Invalid username or Password Please Try Again");
					response.sendRedirect("loginpage");
				}
			
			
		}
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model themodel)
	{
		//create model attribute for binding the form data
		Customer theCustomer=new Customer();
		themodel.addAttribute("customer", theCustomer);
		
		return "add-customer";
	}
	
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer)
	{
		//save the customer using service 
		
		customerService.saveCustomer(theCustomer);
		
		return "redirect:/customer/list";
	}
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId") int theId,Model themodel)
	{
		//get the customer from the database
		Customer theCustomer=customerService.getCustomer(theId);
		
		//set customer as model to process form
		themodel.addAttribute("customer", theCustomer);
		return "add-customer";
	}
	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("customerId") int theId,Model deletemodel)
	{
		//get the customer from the database
		customerService.deleteCustomer(theId);
		
		return "redirect:/customer/list";
		
		
	}
	@GetMapping("/loginpage")
	public String logout()
	{
		return "login";
	}
}

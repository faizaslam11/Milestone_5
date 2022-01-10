package amith.java.msa5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import amith.java.msa5.entity.Customer;
import amith.java.msa5.service.CustomerService;

@RestController
@RequestMapping(path="/customer")
public class CustomerController 
{
	@Autowired
	private CustomerService customerservice;
	
	public CustomerController(CustomerService customerservice) {
		super();
		this.customerservice = customerservice;
	}
	
	@PostMapping(path="/add")
	public Customer addCustomer(@RequestBody Customer cust)
	{
		return customerservice.addNewCustomer(cust);
	}
	
	@GetMapping(path="/getAllCustomers")
	public Iterable<Customer> getCustomer()
	{
		return customerservice.getAllCustomer();
	}
	
	
}

package amith.java.msa5.service;

import amith.java.msa5.entity.Customer;

public interface CustomerService {

	public Customer addNewCustomer(Customer cust);

	public Iterable<Customer> getAllCustomer();

}

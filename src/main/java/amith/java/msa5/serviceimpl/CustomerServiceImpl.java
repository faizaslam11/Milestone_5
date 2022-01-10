package amith.java.msa5.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import amith.java.msa5.entity.Customer;
import amith.java.msa5.repository.CustomerRepository;
import amith.java.msa5.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService
{
	@Autowired
	private CustomerRepository customerrepo;
	
	public CustomerServiceImpl() {
		super();
	}

	public CustomerServiceImpl(CustomerRepository customerrepo) {
		this.customerrepo = customerrepo;
	}

	@Override
	public Customer addNewCustomer(Customer cust) {
		return customerrepo.save(cust);
		
	}

	@Override
	public List<Customer> getAllCustomer() {
		return customerrepo.findAll();
	}

}

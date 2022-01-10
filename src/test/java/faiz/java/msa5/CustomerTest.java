package faiz.java.msa5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import amith.java.msa5.entity.Customer;
import amith.java.msa5.repository.CustomerRepository;
import amith.java.msa5.serviceimpl.CustomerServiceImpl;

@SpringBootTest
class CustomerTest {
	
	@Autowired 
	private CustomerServiceImpl custserv; 
	
	@MockBean 
	private CustomerRepository custrepo; 
	
	@Test
	public void getAllCustomerTest() {
		when(custrepo.findAll()).thenReturn(Stream.of(new Customer(1L, "Faiz", "Male", 22, "nonveg"), new Customer(2L, "Kishan", "Male", 24, "nonveg")).collect(Collectors.toList()));
		assertEquals(2, ( custserv.getAllCustomer()).size()); 
	}
	
	@Test
	public void addCustomerTest() {
		Customer c1=new Customer(1L, "Faiz", "Male", 22, "nonveg"); 
		when(custrepo.save(c1)).thenReturn(c1); 
		assertEquals(c1, custserv.addNewCustomer(c1));
	}

}

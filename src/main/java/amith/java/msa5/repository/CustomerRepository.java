package amith.java.msa5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import amith.java.msa5.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> 
{

}

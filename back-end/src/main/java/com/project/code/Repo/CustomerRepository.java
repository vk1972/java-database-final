package com.project.code.Repo;

import com.project.code.Model.Customer; 
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import org.springframework.stereotype.Repository;



@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

	Customer findByEmail(String email);

	Customer findByid(Long id); 

	public List<Customer> findByName(String name);
}
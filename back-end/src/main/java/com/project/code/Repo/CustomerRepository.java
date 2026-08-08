package com.project.code.Repo;

import com.project.code.Model.Customer; 
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

	Customer findByEmail(String email);

	Customer findByid(Long id); 

	public List<Customer> findByName(String name);
}
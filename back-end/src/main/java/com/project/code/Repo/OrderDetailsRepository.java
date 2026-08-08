package com.project.code.Repo;

import com.project.code.Model.OrderDetails; 
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Long> { } 
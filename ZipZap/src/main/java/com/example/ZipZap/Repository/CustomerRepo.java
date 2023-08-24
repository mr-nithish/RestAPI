package com.example.ZipZap.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.ZipZap.Model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {
	
}

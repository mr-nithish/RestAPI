package com.example.Project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Project.Model.Delivery;

@Repository
public interface DeliveryRepo extends JpaRepository<Delivery, Integer> {

}

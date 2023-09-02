package com.example.Day8.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.Day8.Models.ApiModels;

@Repository
public interface BikeRepo extends JpaRepository<ApiModels, Integer> {
	
	@Query(value = "select * from api_models where year= :y",nativeQuery = true)
	List<ApiModels> year(int y);
	
	@Query(value = "select * from api_models where year= :y and bikeName = :n",nativeQuery = true)
	List<ApiModels> yearname(int y,String n);
	
	@Query(value = "select * from api_models where bikeName= :n",nativeQuery = true)
	List<ApiModels> name(String n);
}

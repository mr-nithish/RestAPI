package com.example.Day8.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Day8.Models.ApiModels;
import com.example.Day8.Repository.BikeRepo;

@Service
public class BikeService {
	
	@Autowired
	BikeRepo br;
	
	public ApiModels add(ApiModels a) {
		return br.save(a);
	}
	
	public List<ApiModels> showyear(int year) {
		return br.year(year);
	}
	
	public List<ApiModels> showyearname(int year,String name){
		return br.yearname(year, name);
	}
	
	public List<ApiModels> showname(String name) {
		return br.name(name);
	}
}

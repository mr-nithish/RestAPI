package com.example.Day8.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Day8.Models.ApiModels;
import com.example.Day8.Service.BikeService;


@RestController
public class ApiController {
	
	@Autowired
	BikeService bs;
	
	@PostMapping("/")
	public ApiModels update (@RequestBody ApiModels a) {
		return bs.add(a);
	}
	
	@GetMapping("/year/{year}")
	public List<ApiModels> show(@PathVariable int year){
		return bs.showyear(year);
	}
	
	@GetMapping("/year/{year}/bike/{bikeName}")
	public List<ApiModels> showb(@PathVariable int year,String name){
		return bs.showyearname(year, name);
	}
	
	@GetMapping("/bikename/{bikeName}")
	public List<ApiModels> shown(@PathVariable String name){
		return bs.showname(name);
	}
}

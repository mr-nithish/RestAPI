package com.example.Project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.Project.Model.Signup;
import com.example.Project.Service.SignupService;

@RestController
public class SignupController {
	
	@Autowired
	SignupService ss;
	
	@PostMapping("/create")
	public Signup addinfo(@RequestBody Signup su) {
		return ss.savesignup(su);
	}
	
	@GetMapping("/show")
	public List<Signup> showinfor(){
		return ss.showsignup();
	}
	
	@PutMapping("/update")
	public Signup updateinfo(Signup su) {
		return ss.updatesignup(su);
	}
	
	@DeleteMapping("/delete/{email}")
	public String deleteinfo(@PathVariable String email) {
		return ss.deletesignup(email);
	}
}

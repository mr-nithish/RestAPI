package com.example.Project.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Project.Model.Signup;
import com.example.Project.Repository.SignupRepo;

@Service
public class SignupService {
	
	@Autowired
	SignupRepo sr;
	
	public Signup savesignup(Signup su) {
		return sr.save(su);
	}
	
	public List<Signup> showsignup(){
		return sr.findAll();
	}
	
	public Signup updatesignup(Signup su) {
		return sr.saveAndFlush(su);
	}
	
	public String deletesignup(String email) {
		sr.deleteById(email);
		return "Successfully delted";
	}
}

package com.example.Project.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Project.Model.Delivery;
import com.example.Project.Repository.DeliveryRepo;

@Service
public class DeliveryService {
	
	@Autowired
	DeliveryRepo dr;
	
	public Delivery add(Delivery d) {
		return dr.save(d);
	}
	
	public List<Delivery> show(){
		return dr.findAll();
	}
	
	public Delivery showone(int id) {
		return dr.getReferenceById(id);
	}
	
	public Delivery update(Delivery d) {
		return dr.saveAndFlush(d);
	}
	
	public String delete(int id,String staus) {
		if(staus.equals("YES"))
		{
			dr.deleteById(id);
			return "The item is delivered";
		}
		return "The item is not delivered";
	}
}

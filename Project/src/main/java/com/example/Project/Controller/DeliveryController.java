package com.example.Project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.Project.Model.Delivery;
import com.example.Project.Service.DeliveryService;

@RestController
public class DeliveryController {
	
	@Autowired
	DeliveryService ds;
	
	@PostMapping("/adddelivery")
	public Delivery adddelivery(@RequestBody Delivery d) {
		return ds.add(d);
	}
	
	@GetMapping("/showone")
	public Delivery getone(int id) {
		return ds.showone(id);
	}
	
	@GetMapping("/showdelivery")
	public List<Delivery> showdelivery() {
		return ds.show();
	}
	
	@PutMapping("/updatedelivery")
	public Delivery updatedelivery(Delivery d) {
		return ds.update(d);
	}
	
	@DeleteMapping("/deletedelivery")
	public String deletedelivery(@RequestParam int id) {
		String status = "";
		status = getone(id).getPackstatus();
		return ds.delete(id, status);
	}
}

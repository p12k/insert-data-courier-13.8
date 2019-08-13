package com.example.courier1.controller;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.courier1.bean.Couriers;
import com.example.courier1.Couriers.dao.CouriersDao;


@CrossOrigin(origins="http://localhost:4200") 
@RestController
@RequestMapping("/courier")

public class CourierController {

	@Autowired
	private CouriersDao dao;
	
	@PostMapping("couriers")
	
	
	
	@CrossOrigin(origins="http://localhost:4200") 
	public String Couriers(@RequestBody Couriers cour) {	
	System.out.println("Courier");	
     dao.save(cour)	;
   return "courier";


		// (List<Couriers>) dao.findAll();
	}
	
	@DeleteMapping("delete/{id}")
	@CrossOrigin(origins="http://localhost:4200") 
	public boolean deletecourier(@PathVariable int id) {
		dao.deleteById(id);;
		return true;
		
	}
}




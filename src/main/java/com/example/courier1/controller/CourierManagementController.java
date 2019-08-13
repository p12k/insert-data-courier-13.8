package com.example.courier1.controller;
	import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.courier1.Couriers.dao.CourierManagementDAO;
import com.example.courier1.bean.Couriers;

	
	@RestController
	public class CourierManagementController {
		
		@Autowired
		
		private CourierManagementDAO dao;
		@GetMapping("/couriers")
		@CrossOrigin(origins="http://localhost:4200") 
		public List<Couriers> getCouriers(){
			
			System.out.println("Received request");
			return (List<Couriers>) dao.findAll();
		}
		
}
	

	
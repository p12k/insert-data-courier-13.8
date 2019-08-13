package com.example.courier1.Couriers.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.courier1.bean.Couriers;

public interface CouriersDao extends CrudRepository<Couriers, Integer> {
	
}

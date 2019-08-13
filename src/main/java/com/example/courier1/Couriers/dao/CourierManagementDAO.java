package com.example.courier1.Couriers.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.courier1.bean.Couriers;

@Service
public interface CourierManagementDAO extends CrudRepository<Couriers,Integer>{

}

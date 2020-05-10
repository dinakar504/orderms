package com.cap.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cap.demo.entities.WareHouse;
import com.cap.demo.service.ServiceI;

@RestController
@CrossOrigin("http://localhost:4200")
public class DrinkAndDelightController {
	@Autowired
	ServiceI service;
		  @GetMapping("getAllDis") 
	  public List<WareHouse> getAllDist() {
	
	   return service.getAlldis();
	  }
	  
	  
}

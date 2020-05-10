package com.cap.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cap.demo.entities.RawMaterialSpecs;
import com.cap.demo.service.ServiceI;

@RestController
@CrossOrigin("http://localhost:4200")
public class DrinkAndDelightController {
	@Autowired
	ServiceI service;
	  @GetMapping("getALlSPecs") 
	  public List<RawMaterialSpecs> getAllSpecs() {
	
	   return service.getallSpecs();
	  }  
	  @GetMapping("getName/{rmsid}") 
	  public RawMaterialSpecs getName(@PathVariable int rmsid) {
	
	   return service.getSpec(rmsid);
	  } 
	  @PostMapping("putvalues") 
	  public void getName(@RequestBody RawMaterialSpecs order) {
	
	    service.putData(order);
	  } 

}

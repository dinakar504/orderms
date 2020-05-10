package com.cap.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cap.demo.entities.User;
import com.cap.demo.exception.UnsuccessfulOperation;
import com.cap.demo.service.DadServiceI;

@RestController
@CrossOrigin("http://localhost:4200")
public class DrinkAndDelightController {
	@Autowired
	DadServiceI service;
	
	  @GetMapping("/validate/{uid}/{upass}")
	  public ResponseEntity<User> validate(@PathVariable int uid,@PathVariable String upass)
	  {
		 User response =service.validateUser(uid, upass);
        
			if(response!=null)
				return	new ResponseEntity<User>(response, HttpStatus.OK);
			else
			    throw new UnsuccessfulOperation(null);
			
	  }
	  
}

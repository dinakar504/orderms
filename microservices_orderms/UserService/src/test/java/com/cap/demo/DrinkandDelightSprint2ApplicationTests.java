package com.cap.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.cap.demo.entities.User;
import com.cap.demo.service.DadServiceI;


@SpringBootTest
public class DrinkandDelightSprint2ApplicationTests {
	@Autowired
	DadServiceI service;
	@Test
	public void validate() {
		User user=service.validateUser(1,"dinakar1");
		System.out.println(user.toString());
		User user1=new User();
		user1.setUserid(1);
		user1.setUpass("dinakar1");
		user1.setUname("dinakar");
		Assertions.assertEquals(user1.toString(), user.toString());
		//	Assert.assertEquals(1,1);
	}

}

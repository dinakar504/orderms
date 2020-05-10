package com.cap.demo;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.cap.demo.entities.WareHouse;
import com.cap.demo.service.ServiceI;

@SpringBootTest
class DrinkandDelightSprint2ApplicationTests {

	@Autowired
	ServiceI service;
	
	@Test
	public void test1()
	{
		List<WareHouse> list = service.getAlldis();
		Assertions.assertEquals(2, list.size());
	}

}

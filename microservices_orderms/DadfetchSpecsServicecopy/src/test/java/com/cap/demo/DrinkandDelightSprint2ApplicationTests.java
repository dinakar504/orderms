package com.cap.demo;



import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cap.demo.entities.RawMaterialSpecs;
import com.cap.demo.service.ServiceI;

@SpringBootTest
public class DrinkandDelightSprint2ApplicationTests {

	@Autowired
	ServiceI service;
	
	@Test
	public void test1()
	{
		List<RawMaterialSpecs> list = service.getallSpecs();
		Assertions.assertEquals(2, list.size());
	}

}

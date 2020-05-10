package com.cap.demo;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cap.demo.entities.SupplierEntity;
import com.cap.demo.service.ServiceI;

@SpringBootTest
class DrinkandDelightSprint2ApplicationTests {

	@Autowired
	ServiceI service;
	
	@Test
	public void test1()
	{
		List<SupplierEntity> list = service.getsup();
		Assertions.assertEquals(1, list.size());
	}
}

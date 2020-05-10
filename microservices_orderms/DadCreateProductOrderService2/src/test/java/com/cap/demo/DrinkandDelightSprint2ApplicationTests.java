package com.cap.demo;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cap.demo.entities.ProductOrderEntity;
import com.cap.demo.service.DadServiceI;


@SpringBootTest
class DrinkandDelightSprint2ApplicationTests {

	@Autowired
	DadServiceI service;
	@Test
	public void getTest() {
		service.getAllOrders(1);
		List<ProductOrderEntity> list = service.getAllOrders(1);
		Assertions.assertNotNull(list);
		//Assertions.assertEquals(list, null);
}
	@Test
	public void creaetTest()
	{
		ProductOrderEntity product= new ProductOrderEntity();
		product.setDeliveryStus("Not dis");
		product.setName("sprite");
		product.setOrderid(1);
		product.setPid(1);
		product.setQuanvalue(2);
		product.setSupplierid(1);
		product.setTotalprice(20);
		product.setUserid(5);
		product.setWarehouseid(1);
		
		ProductOrderEntity e=service.orderCreation(product);
		product.setOrderid(e.getOrderid());
		Assertions.assertEquals(e.toString(), product.toString());
	}

}

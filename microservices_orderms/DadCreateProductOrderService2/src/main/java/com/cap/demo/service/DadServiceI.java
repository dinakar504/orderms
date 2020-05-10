package com.cap.demo.service;

import java.util.List;

import com.cap.demo.entities.ProductOrderEntity;

public interface DadServiceI {

	ProductOrderEntity orderCreation(ProductOrderEntity raw);

	List<ProductOrderEntity> getAllOrders(int uid);

	Object trackOrder(int orderid);

}

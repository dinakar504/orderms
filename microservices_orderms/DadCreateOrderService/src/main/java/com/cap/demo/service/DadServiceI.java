package com.cap.demo.service;

import java.util.List;

import com.cap.demo.entities.RawMAterialOrderEntity;

public interface DadServiceI {

	RawMAterialOrderEntity orderCreation(RawMAterialOrderEntity raw);

	List<RawMAterialOrderEntity> getAllOrders(int uid);

	Object trackOrder(int orderid);

}

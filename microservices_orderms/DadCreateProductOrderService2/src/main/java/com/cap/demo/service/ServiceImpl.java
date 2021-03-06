package com.cap.demo.service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.demo.dao.ProductOrderDAO;
import com.cap.demo.entities.ProductOrderEntity;

@Service
public class ServiceImpl implements DadServiceI{
	@Autowired
ProductOrderDAO dao;
	
    @Override
	public List<ProductOrderEntity> getAllOrders(int uid)
	{
		return dao.getAllOrders(uid);
	}
    @Override
	public ProductOrderEntity orderCreation(ProductOrderEntity raw) {

		
		Date dateofOrder=new Date();
		java.sql.Date dateOfOrder1=new java.sql.Date(dateofOrder.getTime());
		raw.setDateoford(dateOfOrder1);
		/*date setting*/
		Calendar cal = Calendar.getInstance();
		cal.setTime(dateofOrder);
		cal.add(Calendar.DATE, 4);
		Date modifiedDate = cal.getTime();
		
		java.sql.Date dateOfdel=new java.sql.Date(modifiedDate.getTime());
		raw.setDateofdel(dateOfdel);
		raw.setDeliveryStus("Not dis");
		return dao.save(raw);
	}
	
	@Override
	public Object trackOrder(int orderid)
	{
		return dao.trackOrder(orderid);
	}
	
}

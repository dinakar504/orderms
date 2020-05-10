package com.cap.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.demo.dao.WareHouseDao;
import com.cap.demo.entities.WareHouse;

@Service
public class ServiceImpl implements ServiceI{

	@Autowired
	WareHouseDao dao3;
	@Override
		public List<WareHouse> getAlldis()
	{
		return dao3.getAllDis();
	}


	
	
	
	
	
}

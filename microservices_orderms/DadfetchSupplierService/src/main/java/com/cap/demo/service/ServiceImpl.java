package com.cap.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.demo.dao.SupllierDao;
import com.cap.demo.entities.SupplierEntity;

@Service
public class ServiceImpl implements ServiceI{

	@Autowired
SupllierDao dao1;
	@Override
	public List<SupplierEntity> getsup()
	{
		return dao1.getAllSup();
	}
		
	
}

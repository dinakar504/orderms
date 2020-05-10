package com.cap.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.demo.dao.ProductSpecsDao;
import com.cap.demo.entities.ProductSpecs;

@Service
public class ServiceImpl implements ServiceI{
	@Autowired
	ProductSpecsDao dao2;

	@Override
	public List<ProductSpecs> getallSpecs()
	{
		return dao2.getAllSpecs();
	}
	
	@Override
	public ProductSpecs getSpec(int rmsid)
	{
		return dao2.getByid(rmsid);
	}
	@Override
	public void postProduct(ProductSpecs product)
	{
		dao2.save(product);
	}
	
}

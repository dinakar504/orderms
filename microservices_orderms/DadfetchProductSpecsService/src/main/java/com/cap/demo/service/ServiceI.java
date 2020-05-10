package com.cap.demo.service;

import java.util.List;

import com.cap.demo.entities.ProductSpecs;

public interface ServiceI {

	List<ProductSpecs> getallSpecs();

	ProductSpecs getSpec(int rmsid);

	void postProduct(ProductSpecs product);

}

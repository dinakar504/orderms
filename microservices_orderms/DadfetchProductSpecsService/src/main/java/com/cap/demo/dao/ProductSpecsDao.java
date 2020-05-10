package com.cap.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cap.demo.entities.ProductSpecs;

@Repository
public interface ProductSpecsDao extends JpaRepository<ProductSpecs, Integer>{
	@Query("SELECT p FROM ProductSpecs p ")
	public List<ProductSpecs> getAllSpecs();
	@Query("SELECT p FROM ProductSpecs p where p.pid=?1")
	public ProductSpecs getByid(int rsmid);

}

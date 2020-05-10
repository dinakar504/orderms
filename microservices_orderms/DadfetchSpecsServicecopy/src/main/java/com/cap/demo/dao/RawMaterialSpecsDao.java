package com.cap.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cap.demo.entities.RawMaterialSpecs;

@Repository
public interface RawMaterialSpecsDao extends JpaRepository<RawMaterialSpecs, Integer>{
	@Query("SELECT p FROM RawMaterialSpecs p ")
	public List<RawMaterialSpecs> getAllSpecs();
	@Query("SELECT p FROM RawMaterialSpecs p where p.rmsid=?1")
	public RawMaterialSpecs getByid(int rsmid);

}

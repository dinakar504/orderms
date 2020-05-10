package com.cap.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cap.demo.entities.WareHouse;

public interface WareHouseDao extends JpaRepository<WareHouse, Integer>{
	@Query("SELECT p FROM WareHouse p ")
	public List<WareHouse> getAllDis();
}

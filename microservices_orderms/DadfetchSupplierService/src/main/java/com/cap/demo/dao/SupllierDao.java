package com.cap.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cap.demo.entities.SupplierEntity;
@Repository
public interface SupllierDao extends JpaRepository<SupplierEntity, Integer> {
	@Query("SELECT p FROM SupplierEntity p")
	public List<SupplierEntity> getAllSup();
}

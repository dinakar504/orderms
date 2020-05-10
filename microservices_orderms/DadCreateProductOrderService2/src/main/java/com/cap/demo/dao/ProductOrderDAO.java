package com.cap.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cap.demo.entities.ProductOrderEntity;


@Repository
public interface ProductOrderDAO extends JpaRepository<ProductOrderEntity, Integer>{
@Query("SELECT p FROM ProductOrderEntity p where p.userid=?1")
public List<ProductOrderEntity> getAllOrders(int uid);
@Query("SELECT p.dateoford,p.dateofdel,p.deliveryStus FROM ProductOrderEntity p where p.orderid=?1")
public Object trackOrder(int oid);


}

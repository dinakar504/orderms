package com.cap.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cap.demo.entities.RawMAterialOrderEntity;


@Repository
public interface RawMAterialOrderDAO extends JpaRepository<RawMAterialOrderEntity, Integer>{
@Query("SELECT p FROM RawMAterialOrderEntity p where p.userid=?1")
public List<RawMAterialOrderEntity> getAllOrders(int uid);
@Query("SELECT p.dateoford,p.dateofdel,p.deliveryStus FROM RawMAterialOrderEntity p where p.orderid=?1")
public Object trackOrder(int oid);


}

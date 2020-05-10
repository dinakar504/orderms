package com.cap.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cap.demo.entities.User;


@Repository
public interface UserDao extends JpaRepository<User, Integer>{
	@Query("SELECT p FROM User p where p.userid=?1 and p.upass=?2")
	public User getuser(int uid,String upass);



}

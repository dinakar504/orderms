package com.cap.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.demo.dao.UserDao;
import com.cap.demo.entities.User;

@Service
public class ServiceImpl implements DadServiceI{
	@Autowired
UserDao dao;
	
  @Override
  public User validateUser(int uid, String upass)
  {
	 return dao.getuser(uid, upass);
  }
	
}

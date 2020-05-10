package com.cap.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER1")
public class User {
@Id
private int userid;
private String uname;
private String upass;
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getUpass() {
	return upass;
}
public void setUpass(String upass) {
	this.upass = upass;
}
@Override
public String toString() {
	return "User [userid=" + userid + ", uname=" + uname + ", upass=" + upass + "]";
}



}

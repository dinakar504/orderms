package com.cap.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SUPPLIER")
public class SupplierEntity {
	@Id
private int supplierid;
private String name;
private String address;
private int phonenum;
public int getSupplierid() {
	return supplierid;
}
public void setSupplierid(int supplierid) {
	this.supplierid = supplierid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getPhonenum() {
	return phonenum;
}
public void setPhonenum(int phonenum) {
	this.phonenum = phonenum;
}

}

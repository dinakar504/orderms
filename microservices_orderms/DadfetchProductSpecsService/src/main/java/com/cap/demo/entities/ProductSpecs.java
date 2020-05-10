package com.cap.demo.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCTSPECS")
public class ProductSpecs {

	@Id
private int pid;
private String pname;
private int pricePerUnit;
private Date expirydat;
private Date manudate;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public int getPricePerUnit() {
	return pricePerUnit;
}
public void setPricePerUnit(int pricePerUnit) {
	this.pricePerUnit = pricePerUnit;
}
public Date getExpirydat() {
	return expirydat;
}
public void setExpirydat(Date expirydat) {
	this.expirydat = expirydat;
}
public Date getManudate() {
	return manudate;
}
public void setManudate(Date manudate) {
	this.manudate = manudate;
}
}

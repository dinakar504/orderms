package com.cap.demo.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "RAWMATERIALSPECS1")
public class RawMaterialSpecs {
public int getRmsid() {
		return rmsid;
	}
	public void setRmsid(int rmsid) {
		this.rmsid = rmsid;
	}
	public String getRmname() {
		return rmname;
	}
	public void setRmname(String rmname) {
		this.rmname = rmname;
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
	@Id
private int rmsid;
private String rmname;
private int pricePerUnit;
@Temporal(TemporalType.DATE)
private Date expirydat;
@Temporal(TemporalType.DATE)
private Date manudate;
}

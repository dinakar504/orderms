package com.cap.demo.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "RAWMATERIALORDER1")
public class RawMAterialOrderEntity {
	@Id
	@GeneratedValue
	private int orderid;
	private String name;
	private int rmsid;
	public int getRmsid() {
		return rmsid;
	}

	public void setRmsid(int rmsid) {
		this.rmsid = rmsid;
	}

	private int supplierid;
	private int quanvalue;
	private String quanunit;
	@Temporal(TemporalType.DATE)
	private Date dateoford;
	@Temporal(TemporalType.DATE)
	private Date dateofdel;
	private int totalprice;
	private String deliveryStus;
	private int warehouseid;
	

	private int userid;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSupplierid() {
		return supplierid;
	}

	public void setSupplierid(int supplierid) {
		this.supplierid = supplierid;
	}

	public int getQuanvalue() {
		return quanvalue;
	}

	public void setQuanvalue(int quanvalue) {
		this.quanvalue = quanvalue;
	}

	public String getQuanunit() {
		return quanunit;
	}

	public void setQuanunit(String quanunit) {
		this.quanunit = quanunit;
	}

	public Date getDateoford() {
		return dateoford;
	}

	public void setDateoford(Date dateoford) {
		this.dateoford = dateoford;
	}

	public Date getDateofdel() {
		return dateofdel;
	}

	public void setDateofdel(Date dateofdel) {
		this.dateofdel = dateofdel;
	}

	public int getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}

	public String getDeliveryStus() {
		return deliveryStus;
	}

	public void setDeliveryStus(String deliveryStus) {
		this.deliveryStus = deliveryStus;
	}

	public int getWarehouseid() {
		return warehouseid;
	}

	public void setWarehouseid(int warehouseid) {
		this.warehouseid = warehouseid;
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	@Override
	public String toString() {
		return "RawMAterialOrderEntity [orderid=" + orderid + ", name=" + name + ", rmsid=" + rmsid + ", supplierid="
				+ supplierid + ", quanvalue=" + quanvalue + ", quanunit=" + quanunit + ", dateoford=" + dateoford
				+ ", dateofdel=" + dateofdel + ", totalprice=" + totalprice + ", deliveryStus=" + deliveryStus
				+ ", warehouseid=" + warehouseid + ", userid=" + userid + "]";
	}
	
}

package com.cap.demo.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "PRODUCTORDER")
public class ProductOrderEntity {
	@Override
	public String toString() {
		return "ProductOrderEntity [orderid=" + orderid + ", name=" + name + ", pid=" + pid + ", supplierid="
				+ supplierid + ", quanvalue=" + quanvalue + ", quanunit=" + quanunit + ", dateoford=" + dateoford
				+ ", dateofdel=" + dateofdel + ", totalprice=" + totalprice + ", deliveryStus=" + deliveryStus
				+ ", warehouseid=" + warehouseid + ", userid=" + userid + "]";
	}
	@Id
	@GeneratedValue
	private int orderid;
	private String name;
	private int pid;
	private int supplierid;
	private int quanvalue;
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
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
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	private String quanunit;
	@Temporal(TemporalType.DATE)
	private Date dateoford;
	@Temporal(TemporalType.DATE)
	private Date dateofdel;
	private int totalprice;
	private String deliveryStus;
	private int warehouseid;
	private int userid;

		
}

package com.arun.shop.entity;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

//import com.sun.tools.javac.util.List;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long pid;
	
	String productName;
	String productDesc;
	String image;
	
	@OneToMany(mappedBy="product")
	private List<Orders> orders;

	public Product() {
		super();
	}

	public Product(long pid, String productName, String productDesc, String image, List<Orders> orders) {
		super();
		this.pid = pid;
		this.productName = productName;
		this.productDesc = productDesc;
		this.image = image;
		this.orders = orders;
	}

	public long getPid() {
		return pid;
	}

	public void setPid(long pid) {
		this.pid = pid;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	@Transient
	public String getImage() {
		//if (image == null || pid == null) return null;
		return "/user-photos/" + pid + "/" + image;
		}

	public void setImage(String image) {
		this.image = image;
	}

	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}

	}

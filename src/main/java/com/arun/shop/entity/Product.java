package com.arun.shop.entity;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

//import com.sun.tools.javac.util.List;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long pid;
	
	String productName;
	String productDesc;
	
	@OneToMany(mappedBy="Product", cascade=CascadeType.ALL)
	private List<Order> orders;

	public Product() {
		super();
	}

	public Product(long pid, String productName, String productDesc, List<Order> orders) {
		super();
		this.pid = pid;
		this.productName = productName;
		this.productDesc = productDesc;
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

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
	
	
	}

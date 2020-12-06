package com.arun.shop.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Order {
	@Id
@GeneratedValue(strategy=GenerationType.AUTO)

private long orderId;
	
	@OneToOne(cascade=CascadeType.ALL)
	private User user;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Product product;

	public Order() {
		super();
	}

	public Order(long orderId, User user, Product product) {
		super();
		this.orderId = orderId;
		this.user = user;
		this.product = product;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	
}



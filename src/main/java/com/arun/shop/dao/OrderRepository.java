package com.arun.shop.dao;

import org.springframework.data.repository.CrudRepository;
//import com.arun.shop.entity.Order;
import org.springframework.stereotype.Repository;

import com.arun.shop.entity.Order;

@Repository
public interface OrderRepository  extends CrudRepository<Order,Long>{

}

package com.arun.shop.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arun.shop.dao.ProductRepository;
import com.arun.shop.entity.Product;

//import con.arun.shop.dao.*;
//import con.arun.shop.entity.*;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductRepository productRepository;
	
	@GetMapping
	public List<Product> getProducts(){
		List<Product> products=(List<Product>)productRepository.findAll();
		return products;
	}

}

package com.project.ecommerceServer.service;

import java.util.List;

import com.project.ecommerceServer.entities.Product;

public interface ProductService {

	
	public List<Product> getAllProduct();

	List<Product> addProduct(Product product);
}

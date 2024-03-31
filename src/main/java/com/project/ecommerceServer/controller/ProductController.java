package com.project.ecommerceServer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.ecommerceServer.entities.Product;
import com.project.ecommerceServer.service.ProductService;

@RestController
@RequestMapping(value = "/product")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
//	@RequestMapping(value = "/testingProducts",method = RequestMethod.GET)
//	public String testProduct(){
//		
//		return "Working product controller";
//		
//	}
	
	@RequestMapping(value = "/allProducts",method = RequestMethod.GET)
	public List<Product> getAllProduct(){
		
		return productService.getAllProduct();
		
	}
	
	@RequestMapping(value = "/addProduct",method = RequestMethod.POST)
	public List<Product> addProduct(@RequestBody  Product product ){
		
		return productService.addProduct(product);
		
	}
	
//	public 
	

}

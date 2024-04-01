package com.project.ecommerceServer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.ecommerceServer.entities.Product;
import com.project.ecommerceServer.service.ProductService;

@RestController
@RequestMapping(value = "/product")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	
	@RequestMapping(value = "/allProducts",method = RequestMethod.GET)
	public List<Product> getAllProduct(){
		
		return productService.getAllProduct();
		
	}
	
	@RequestMapping(value = "/addProduct",method = RequestMethod.POST)
	public List<Product> addProduct(@RequestBody  Product product ){
		
		return productService.addProduct(product);
		
	}
	
	@RequestMapping(value = "/deleteProduct",method = RequestMethod.DELETE)
	public ResponseEntity<HttpStatus> deleteProduct(@RequestParam String prodId){
		
		try {
			productService.deleteProduct(Long.parseLong(prodId));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		
	}
	

}

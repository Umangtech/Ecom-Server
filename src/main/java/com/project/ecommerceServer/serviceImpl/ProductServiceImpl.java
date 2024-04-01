package com.project.ecommerceServer.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.project.ecommerceServer.Dao.ProductDao;
import com.project.ecommerceServer.entities.Product;
import com.project.ecommerceServer.service.ProductService;

@Service
public class ProductServiceImpl  implements ProductService{
	
	@Autowired
	private ProductDao productDao;
	
	@Override
	public List<Product> getAllProduct(){
		return productDao.findAll();
	}
	
	@Override
	public List<Product> addProduct(Product product){
		
		try {
			productDao.save(product);
			return getAllProduct();
		}
		catch(Exception e) {
			System.out.println("Exception in saving product"+e);
			return null;
		}
	
	}
	
	@Override
	public void deleteProduct(Long prodId) {
		Product entity= productDao.getOne(prodId);
		
		productDao.delete(entity);
	}

}

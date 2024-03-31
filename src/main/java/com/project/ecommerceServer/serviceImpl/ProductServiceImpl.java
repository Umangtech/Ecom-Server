package com.project.ecommerceServer.serviceImpl;

import java.util.ArrayList;
import java.util.List;

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
	
//	List<Product> list;
//	
//	public ProductServiceImpl() {
//		
//		list=new ArrayList<>();
//		list.add(new Product(1,"demo Product 1",100));
//		list.add(new Product(2,"demo Product 2",100));
//		list.add(new Product(3,"demo Product 3",100));
//		list.add(new Product(4,"demo Product 4",100));
//		list.add(new Product(5,"demo Product 5",100));
//		
//	}
	
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

}

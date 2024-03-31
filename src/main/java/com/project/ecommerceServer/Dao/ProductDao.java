package com.project.ecommerceServer.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.ecommerceServer.entities.Product;

public interface ProductDao extends JpaRepository<Product, Long> {

}

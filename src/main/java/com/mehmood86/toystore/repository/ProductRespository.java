package com.mehmood86.toystore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mehmood86.toystore.entity.Product;

public interface ProductRespository extends JpaRepository<Product, Integer>{
	
	Product findByName(String name);

}

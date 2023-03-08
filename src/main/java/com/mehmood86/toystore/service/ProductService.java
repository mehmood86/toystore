package com.mehmood86.toystore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mehmood86.toystore.entity.Product;
import com.mehmood86.toystore.repository.ProductRespository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRespository repository;
	
	public Product saveProduct(Product product) {
		product.getTotalPrice();
		//product.setTotalPrice(product.getQuantity() * product.getPrice());
		return repository.save(product);
	}
	
	public List<Product> saveProducts(List<Product> products) {
		return repository.saveAll(products);
	}
	
	public List<Product> getProducts(){
		return repository.findAll();
	}
	
	public Product getProductById(int id) {
		return repository.findById(id).orElse(null);
	}
	
	public Product getProductByName(String name) {
		return repository.findByName(name);
	}
	
	public String deleteProduct(int id) {
		repository.deleteById(id);
		return "Product removed from database with id "+id;
	}
	
	public Product updateProduct(Product product) {
		Product existingProduct = repository.findById(product.getId()).orElse(null);		
		existingProduct.setName(product.getName());
		existingProduct.setPrice(product.getPrice());
		existingProduct.setQuantity(product.getQuantity());
		existingProduct.getTotalPrice();
		return repository.save(existingProduct);
	}
}

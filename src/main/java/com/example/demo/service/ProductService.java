package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public void saveProduct(Product product) {
		repository.save(product);
	}
	
	public List<Product> findAllProduct() {
		return repository.findAll();
	}
}

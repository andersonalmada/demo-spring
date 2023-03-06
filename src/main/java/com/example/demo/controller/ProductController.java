package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

@RestController
@RequestMapping(path = "/api/products")
public class ProductController {

	@Autowired
	private ProductService service;
	
	@PostMapping
	public void saveProduct(@RequestBody Product product) {
		service.saveProduct(product);
	}
	
	@GetMapping
	public List<Product> findAllProducts() {
		return service.findAllProduct();
	}
}

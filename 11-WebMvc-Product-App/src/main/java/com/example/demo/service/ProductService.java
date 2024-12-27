package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Product;

public interface ProductService {
	
	public boolean saveProduct(Product P);
	
	public List<Product> getAllProducts();
	

}

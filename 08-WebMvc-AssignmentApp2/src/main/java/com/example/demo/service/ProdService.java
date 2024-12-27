package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.repo.ProductRepo;

@Service
public class ProdService {
	
	private final ProductRepo productRepo;

	public ProdService(ProductRepo productRepo) {
		super();
		this.productRepo = productRepo;
	}
	
	public List<Product> getAllProducts()
	{
		return productRepo.findAll();
	}

}

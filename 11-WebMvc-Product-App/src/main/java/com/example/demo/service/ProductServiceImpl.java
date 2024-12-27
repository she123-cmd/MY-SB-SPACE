package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.ProductRepo;
import com.example.demo.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {
 
	@Autowired
	private ProductRepo productRepo;
	@Override
	public boolean saveProduct(Product P) {
		// TODO Auto-generated method stub
		 Product savedProduct=productRepo.save(P);
		
		return savedProduct.getPid()!=null;

	}
	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productRepo.findAll();
	}

}

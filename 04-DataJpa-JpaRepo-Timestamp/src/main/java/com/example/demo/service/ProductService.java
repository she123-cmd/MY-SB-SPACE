package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.repo.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepo productrepo;
	
	
	public void saveProduct()
	{
		Product p=new Product();
		
		p.setPid(101);
		p.setPname("HDD");
		p.setPrice(1000.00);
		
		productrepo.save(p);
		
		System.out.println("product saved...S");
		
	}

}

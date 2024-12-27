package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping("/")
	public ModelAndView loadForm()
	{
		ModelAndView mav =new ModelAndView();
		mav.addObject("pobj", new Product());
		mav.setViewName("index");
	    return mav;
	}
	
	@PostMapping("/product")
	public ModelAndView saveProduct(Product pobj)
	{
		ModelAndView mav =new ModelAndView();
		boolean status=productService.saveProduct(pobj);
		
		if(status)
		{
			mav.addObject("smsg", "product saved...");
		}
		else
		{
			mav.addObject("emsg", "failed to save...");
		}
		
		mav.addObject("pobj", new Product());
		mav.setViewName("index");
		return mav;
	}
	
	
	@GetMapping("/products")
	public ModelAndView viewProducts()
	{
		
		List<Product> productList=productService.getAllProducts();
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("plist", productList);
		mav.setViewName("data");
		return mav;
		
	}
}

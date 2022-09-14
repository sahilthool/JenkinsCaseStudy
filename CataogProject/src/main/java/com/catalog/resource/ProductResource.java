package com.catalog.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.catalog.bean.Product;
import com.catalog.service.ProductService;

@RestController
public class ProductResource {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping(path = "/products",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getAllEmployeesResource(){
		return productService.getallProduct();
	}
	
	@GetMapping(path = "/products/{code}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Product getProductByCodeResource(@PathVariable("code") String code) {
		Optional<Product> opProduct = productService.getProductByCode(code);
		Product product = opProduct.orElse(new Product());
		return product;
	}

}

package com.catalog.service;

import java.util.List;
import java.util.Optional;

import com.catalog.bean.Product;

public interface ProductService {
	
	List<Product> getallProduct();
	Optional<Product> getProductByCode(String code);

}

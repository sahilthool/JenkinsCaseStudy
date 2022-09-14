package com.catalog.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catalog.bean.Product;
import com.catalog.persistence.ProductDao;


@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDao productDao;

	@Override
	public List<Product> getallProduct() {
		return productDao.findAll();
	}

	@Override
	public Optional<Product> getProductByCode(String code) {
		return Optional.ofNullable(productDao.findByCode(code));
	}

}

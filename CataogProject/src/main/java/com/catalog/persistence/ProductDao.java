package com.catalog.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.catalog.bean.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer>{
	
	Product findByCode(String code);

}

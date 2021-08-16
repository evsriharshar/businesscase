package com.learn.training.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.training.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	 
	

	Product findByName(String name);
	Product findBybrand(String brand);
	Product findBymadein(String madein);
}
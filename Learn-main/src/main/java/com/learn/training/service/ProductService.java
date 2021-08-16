package com.learn.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.training.Repository.ProductRepository;
import com.learn.training.model.Product;

@Service

public class ProductService {

	@Autowired
	private ProductRepository repo;
	
	public List<Product> listAll() {
		return repo.findAll();
	}
	
	public void save(Product product) {
		repo.save(product);
	}
	
	public Product get(int id) {
		return repo.findById(id).get();
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}
	public Product getByName(String name) {
		return repo.findByName(name);
	}
	
	public Product getByBrand(String brand) {
		return repo.findBybrand(brand);
	}

	public Product getByMadein(String madein) {
		
		return repo.findBymadein(madein);
	}
	

	
}

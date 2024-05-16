package com.product.service;

import java.util.List;

import com.product.entity.Product;

public interface ProductService{
	
	public boolean save(Product object);
	public boolean update(Product object);
	public boolean delete(int id);
	public Product get(int id);
	public List<Product> getByName(String name);
	public List<Product> get(String category);
	public List<Product> getAllProduct();

}

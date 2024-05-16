package com.product.dao;

import java.util.List;

import com.product.entity.Product;

public interface ProductDAO {
	
	public boolean save(Product object);
	public boolean update(Product p);
	public boolean delete(int id);
	public Product get(int id);
	public List<Product> getByName(String name);
	public List<Product> get(String category);
	public List<Product> getAllProduct();

}

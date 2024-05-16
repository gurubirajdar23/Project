package com.product.serviceimpl;

import java.util.List;

import com.product.dao.ProductDAO;
import com.product.daoimpl.ProductDAOImpl;
import com.product.entity.Product;
import com.product.service.ProductService;

public class ProductServiceImpl  implements ProductService{

	ProductDAO pp=new ProductDAOImpl();
	@Override
	public boolean save(Product object) {
		pp.save(object);
		return true;
	}

	@Override
	public boolean update(Product p) {
		pp.update(p);
		return true;
	}

	@Override
	public boolean delete(int id) {
		pp.delete(id);
		return false;
	}

	@Override
	public Product get(int id) {
		Product product = pp.get(id);
		return product;
		
	}

	@Override
	public List<Product> getAllProduct() {
		List<Product> allProduct = pp.getAllProduct();
		return allProduct;
	}

	@Override
	public List<Product> get(String category) {
		List<Product> list = pp.get(category);
		return list;
	}

	@Override
	public List<Product> getByName(String name) {
		List<Product> byName = pp.getByName(name);
		return byName;
	}

	

	

}

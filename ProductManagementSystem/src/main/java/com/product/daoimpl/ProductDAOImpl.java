package com.product.daoimpl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.product.dao.ProductDAO;
import com.product.entity.Product;
import com.product.util.HibUtil;

public class ProductDAOImpl implements ProductDAO{

	@Override
	public boolean save(Product object) {
		SessionFactory factory = HibUtil.getFactory();
		Session openSession = factory.openSession();
		Serializable save = openSession.save(object);
		openSession.beginTransaction().commit();
		return true;
	}

	@Override
	public boolean update(Product p) {
		SessionFactory factory = HibUtil.getFactory();
		Session openSession = factory.openSession();
		Product product = openSession.get(Product.class, p.getProduct_Id());
		product.setProduct_Name(p.getProduct_Name());
		product.setProduct_Category(p.getProduct_Category());
		product.setExpDate(p.getExpDate());
		product.setMfgDate(p.getMfgDate());
		product.setProduct_Price(p.getProduct_Price());
		product.setProduct_Qty(p.getProduct_Qty());
		openSession.update(product);
		openSession.beginTransaction().commit();
		return true;
	}

	@Override
	public boolean delete(int id) {
		SessionFactory factory = HibUtil.getFactory();
		Session openSession = factory.openSession();
		Product product = openSession.get(Product.class, id);
		openSession.delete(product);
		openSession.beginTransaction().commit();
		return false;
	}

	@Override
	public Product get(int id) {
		SessionFactory factory = HibUtil.getFactory();
		Session openSession = factory.openSession();
		Product product = openSession.get(Product.class, id);
		return product;
		
	}


	@Override
	public List<Product> getAllProduct() {
		SessionFactory factory = HibUtil.getFactory();
		Session openSession = factory.openSession();
		Criteria createCriteria = openSession.createCriteria(Product.class);
		List<Product> list = createCriteria.list();
		return list;
	}

	@Override
	public List<Product> get(String category) {
		SessionFactory factory = HibUtil.getFactory();
		Session openSession = factory.openSession();
		Criteria createCriteria = openSession.createCriteria(Product.class);
		 createCriteria.add(Restrictions.eq("product_Category", category));
		 List<Product> list = createCriteria.list();
		
		return list;
	}

	@Override
	public List<Product> getByName(String name) {
		SessionFactory factory = HibUtil.getFactory();
		Session openSession = factory.openSession();
		Criteria createCriteria = openSession.createCriteria(Product.class);
		 createCriteria.add(Restrictions.eq("product_Name", name));
		 List<Product> list = createCriteria.list();
		return list;
	}

	

	
	

	

}

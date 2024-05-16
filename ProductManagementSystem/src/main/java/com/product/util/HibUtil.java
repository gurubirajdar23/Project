package com.product.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibUtil {

	static SessionFactory buildSessionFactory;

	public static SessionFactory getFactory() {
		Configuration cfg = new Configuration().configure();
		buildSessionFactory = cfg.buildSessionFactory();
		return buildSessionFactory;
	}
	

}

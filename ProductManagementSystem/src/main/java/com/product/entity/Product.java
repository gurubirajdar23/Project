package com.product.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int product_Id;
	
	private String product_Name;
	
	private String product_Category;
	
	private String mfgDate;
	
	private String expDate;
	
	private int product_Qty;
	
	private double product_Price;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Product(int product_Id, String product_Name, String product_Category, String mfgDate, String expDate,
			int product_Qty, double product_Price) {
		super();
		this.product_Id = product_Id;
		this.product_Name = product_Name;
		this.product_Category = product_Category;
		this.mfgDate = mfgDate;
		this.expDate = expDate;
		this.product_Qty = product_Qty;
		this.product_Price = product_Price;
	}



	public Product( String product_Name, String product_Category, String mfgDate, String expDate,
			int product_Qty, double product_Price) {
		super();
		
		this.product_Name = product_Name;
		this.product_Category = product_Category;
		this.mfgDate = mfgDate;
		this.expDate = expDate;
		this.product_Qty = product_Qty;
		this.product_Price = product_Price;
	}

	public int getProduct_Id() {
		return product_Id;
	}

	public void setProduct_Id(int product_Id) {
		this.product_Id = product_Id;
	}

	public String getProduct_Name() {
		return product_Name;
	}

	public void setProduct_Name(String product_Name) {
		this.product_Name = product_Name;
	}

	public String getProduct_Category() {
		return product_Category;
	}

	public void setProduct_Category(String product_Category) {
		this.product_Category = product_Category;
	}

	public String getMfgDate() {
		return mfgDate;
	}

	public void setMfgDate(String mfgDate) {
		this.mfgDate = mfgDate;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	public int getProduct_Qty() {
		return product_Qty;
	}

	public void setProduct_Qty(int product_Qty) {
		this.product_Qty = product_Qty;
	}

	public double getProduct_Price() {
		return product_Price;
	}

	public void setProduct_Price(double product_Price) {
		this.product_Price = product_Price;
	}

	@Override
	public String toString() {
		return "Product [product_Id=" + product_Id + ", product_Name=" + product_Name + ", product_Category="
				+ product_Category + ", mfgDate=" + mfgDate + ", expDate=" + expDate + ", product_Qty=" + product_Qty
				+ ", product_Price=" + product_Price + "]";
	}
	
	
	

}

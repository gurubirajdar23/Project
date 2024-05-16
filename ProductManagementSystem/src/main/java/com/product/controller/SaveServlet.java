package com.product.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.product.entity.Product;
import com.product.service.ProductService;
import com.product.serviceimpl.ProductServiceImpl;

@WebServlet("/SaveServlet")
public class SaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int qty = Integer.parseInt(request.getParameter("product_Qty"));
		String name = request.getParameter("product_Name");
		String category = request.getParameter("product_Category");
		double price=Double.parseDouble(request.getParameter("product_Price"));
		String mfgDate = request.getParameter("mfgDate");
		String expDate = request.getParameter("expDate");
		
		Product p=new Product(name, category, mfgDate, expDate, qty, price);
		ProductService pp=new ProductServiceImpl();
		pp.save(p);
		String message="added successfully";
		request.setAttribute("msg", message);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("msg.jsp");
		requestDispatcher.forward(request, response);
		response.sendRedirect("msg.jsp");
		
		
	}

}

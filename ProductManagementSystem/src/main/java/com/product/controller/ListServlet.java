package com.product.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.product.entity.Product;
import com.product.service.ProductService;
import com.product.serviceimpl.ProductServiceImpl;


@WebServlet("/ListServlet")
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductService pp=new ProductServiceImpl();
		List<Product> allProduct = pp.getAllProduct();
		request.setAttribute("list", allProduct);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("show.jsp");
		requestDispatcher.forward(request, response);
	}


}

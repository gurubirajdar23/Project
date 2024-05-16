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

@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		request.setAttribute("id",id);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("update.jsp");
		requestDispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("product_Id"));
		System.out.println(id);
		String name = request.getParameter("product_Name");
		String category = request.getParameter("product_Category");
		String mfg = request.getParameter("mfgDate");
		String exp = request.getParameter("expDate");
		int qty = Integer.parseInt(request.getParameter("product_Qty"));
		double price = Double.parseDouble(request.getParameter("product_Price"));

		Product p = new Product(id, name, category, mfg, exp, qty, price);
		ProductService ps = new ProductServiceImpl();
		ps.update(p);
		response.sendRedirect("ListServlet");

	}

}

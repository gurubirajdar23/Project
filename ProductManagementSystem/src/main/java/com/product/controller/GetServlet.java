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


@WebServlet("/GetServlet")
public class GetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       int id = Integer.parseInt(request.getParameter("id"));
       System.out.println(id);
       ProductService pp=new ProductServiceImpl();
       Product product = pp.get(id);
       if(product!=null) {
       request.setAttribute("id", id);
       RequestDispatcher requestDispatcher = request.getRequestDispatcher("get.jsp");
       requestDispatcher.forward(request, response);}
       else {
    	   RequestDispatcher requestDispatcher = request.getRequestDispatcher("msg1.jsp");
           requestDispatcher.forward(request, response);
       }
       
       
       
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}

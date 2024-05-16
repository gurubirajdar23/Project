<%@page import="com.product.entity.Product"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="com.product.util.HibUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>update product</title>
<%@include file="link.jsp" %>
</head>
<body>

<%
int id=(Integer)request.getAttribute("id");
SessionFactory factory=HibUtil.getFactory();
Session s=factory.openSession();
Product p=s.get(Product.class, id);

%>

<%@include file="nav.jsp" %>
<form action="GetServlet">

  <div class="form-group">
    <label for="exampleInputEmail1"> Product Name</label>
    <input type="text" name="product_Name"  value="<%=p.getProduct_Name()%>"  class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
    
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1"> Product Category </label>
    <input type="text" name="product_Category" value="<%=p.getProduct_Category()%>"class="form-control" id="exampleInputPassword1">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1"> MfgDate </label>
    <input type="text" name="mfgDate" value="<%=p.getMfgDate() %>" class="form-control" id="exampleInputPassword1">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1"> expDate </label>
    <input type="text" name="expDate" value="<%=p.getExpDate()%>" class="form-control" id="exampleInputPassword1">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1"> Product Quantity </label>
    <input type="text" name="product_Qty" value="<%=p.getProduct_Qty()%>" class="form-control" id="exampleInputPassword1">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1"> Product Price </label>
    <input type="text" name="product_Price" value="<%=p.getProduct_Price()%> " class="form-control" id="exampleInputPassword1">
  </div>
  
</form>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@include file="link.jsp" %>
</head>
<body>

<%@include file="nav.jsp" %>
<form action="SaveServlet" method="post">
  <div class="form-group">
    <label for="exampleInputEmail1"> Product_Name</label>
    <input type="text" name="product_Name" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
    
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1"> Product_Category </label>
    <input type="text" name="product_Category" class="form-control" id="exampleInputPassword1">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1"> MfgDate </label>
    <input type="text" name="mfgDate" class="form-control" id="exampleInputPassword1">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1"> expDate </label>
    <input type="text" name="expDate" class="form-control" id="exampleInputPassword1">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1"> Product Quantity </label>
    <input type="text" name="product_Qty" class="form-control" id="exampleInputPassword1">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1"> Product_Price </label>
    <input type="text" name="product_Price" class="form-control" id="exampleInputPassword1">
  </div>
  
  <button type="submit" class="btn btn-primary">Add Product</button>
</form>

</body>
</html>
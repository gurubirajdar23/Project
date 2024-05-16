<%@page import="com.product.entity.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product List</title>
</head>
<body>

<%
List<Product> list =(List)request.getAttribute("list");

for(Product p:list){

%>
<h5> Product id:<%= p.getProduct_Id() %> </h5>
<h5> Product name:<%= p.getProduct_Name()%> </h5>
<h5> Product category:<%= p.getProduct_Category() %> </h5>
<h5> Product price:<%= p.getProduct_Price() %> </h5>
<h5> Product mfgdate:<%= p.getMfgDate() %> </h5>
<h5> Product expdate:<%= p.getExpDate() %> </h5>
<a href="UpdateServlet?id=<%=p.getProduct_Id()%>"> Update product</a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="DeleteServlet?id=<%=p.getProduct_Id()%>"> Delete Product</a> <br>

<%
out.println("------------------------------------------------------------------");
}

%>

</body>
</html>
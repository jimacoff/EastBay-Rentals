<%-- 
    Document   : welcome
    Created on : Oct 1, 2015, 3:02:25 PM
    Author     : moniq
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>jsp </title>
         <link rel="stylesheet" href="include/style/style.css">
         <link rel="stylesheet" href="include/style/bootstrap.css">
        <link rel="stylesheet" href="include/style/bootstrap-theme.css">
    </head>
    <body>
        <%@include file="header.jsp"%>
        <h1>Welcome ${sessionScope.user.getUsername()} to the library</h1>

     
        <a href="InventoryServlet?action=load"> View Inventory</a>
        <%@include file="footer.jsp"%>
        
        <a href="AdminServlet"> Admin</a>
    </body>
</html>

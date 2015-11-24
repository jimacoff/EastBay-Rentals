<%-- 
    Document   : update
    Created on : Nov 20, 2015, 10:12:03 PM
    Author     : Monique
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="include/style/bootstrap.css">
        <link rel="stylesheet" href="include/style/bootstrap-theme.css">
        <link rel="stylesheet" href="include/style/cs3520.css">

        <script src="include/js/jquery-2.1.4.js"></script>
        <script src="include/js/bootstrap.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="row">
                <div class="col-md-3"></div>
                <div class="col-md-6">
        <form role="form" action="UpdateServlet?oldEmail=${oldUser.email}" method="post">
            <div class="form-group">
            <label>Username</label>
            <input class="form-control" type="text" name="username" value="${oldUser.username}">
            </div>
            <div class="form-group">
            <label>Password</label>
            <input class="form-control" type="password" name="password">
            </div>
            <div class="form-group">
            <label>Email</label>
            <input class="form-control" type="email" name="email" value="${oldUser.email}">
            </div>
            <input class="btn btn-primary" type="submit" value="Update user">
        </form>
                </div>
                <div class="col-md-3"></div>
                </div>
    </body>
</html>

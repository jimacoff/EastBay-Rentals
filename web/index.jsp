<%-- 
    Document   : index
    Created on : Oct 12, 2015, 8:57:01 PM
    Author     : moniq
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- these tags just can be used in JSP pages not in HTML pages
--%>

<%-- don't use scriplet tag or para pai
--%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="include/style/bootstrap.css">
        <link rel="stylesheet" href="include/style/bootstrap-theme.css">
         <link rel="stylesheet" href="include/style/cs3520.css">
        
        <script src="include/js/jquery-2.1.4.js"></script>
        <script src="include/js/bootstrap.js"></script>
        
    </head>
    <body>
        <%@include file="header.jsp"%>
        <div class="container">
            <form action="login" method="post">
                <div class="form-group">
                    <label> Username</label>
                    <input type="text" name="username"/>
                </div>

                <div class="form_group">
                    <label> Password </label>
                    <input type="password" name="password"/>
                </div>
                <input type="submit" value="Login"/>
                <c:if test="${requestScope.login_error != null}">
                    <div class="alert alert-danger"
                         <span>${requestScope.login_error}</span>
                    </div>
                </c:if>

            </form>
        </div>
        <%@include file="footer.jsp"%>
    </body>
</html>

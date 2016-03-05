<%-- 
    Document   : info
    Created on : Oct 19, 2015, 2:10:18 PM
    Author     : moniq
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>Information provided:</h3>
        <h4>Username: ${sessionScope.user.getUsername()}</h4>
        <h4>Email: ${sessionScope.user.getEmail()}</h4>
        <h4>Birthday: ${sessionScope.user.getBday()}</h4>
        <h4>Phone number: ${sessionScope.user.getPhone()}</h4>
    </body>
</html>

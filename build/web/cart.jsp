<%-- 
    Document   : cart
    Created on : Nov 9, 2015, 9:26:50 PM
    Author     : moniq
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>Shopping Cart</title>
    </head>
    <body>
        <table>
            <tr>
                <th>
                    ISBN
                </th>
                <th>
                    Title
                </th>
                <th>
                    Quantity
                </th>
            </tr>
            <c:forEach var="book" items="${cart.books}">
                <tr>
                    <td>
                        ${book.isbn}
                    </td>
                    <td>
                        ${book.title}
                    </td>
               
                </tr>
        </c:forEach>
        </table>
    </body>
</html>

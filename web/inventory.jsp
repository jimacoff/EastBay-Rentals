<%-- 
    Document   : inventory
    Created on : Oct 21, 2015, 8:28:46 PM
    Author     : moniq
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Book inventory</title>
        <link rel="stylesheet" href="include/style/bootstrap.css">
        <link rel="stylesheet" href="include/style/bootstrap-theme.css">
        <link rel="stylesheet" href="include/style/cs3520.css">

        <script src="include/js/jquery-2.1.4.js"></script>
        <script src="include/js/bootstrap.js"></script>

    </head>
    <body>
        <%@include file="header.jsp"%>
        <div class="container-fluid">
            <div class="col-lg-12">
            <div class="row"  >
                
                    <h1>Inventory of books</h1>

            </div>
                <%--    ${name} --%>
            
            <div class="row">

                    <table class="table"> 
                        <tr>
                            <th>IBSN</th> 
                            <th>Title</th>
                            <th>Author</th>
                            <th>Copyright</th>
                            <th>Count</th>
                        </tr>

                        <c:forEach var="book" items="${requestScope.inventory}" varStatus="status">
                            <%--<tr class="${status.index%2==0 ? "evenrow" : ""}">
                                <td>${book.isbn}</td>
                                <td>${book.title}</td>
                                <td>${book.author}</td>
                                <td>${book.copyright}</td>
                                <td>${book.count}</td>
                            </tr> --%>
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    ${book.title}
                                </div>
                                <div class="panel-body">
                                    <div class="row">
                                        <div class="col-md-4">
                                            <div class="form-group">
                                                <strong>ISBN:</strong> ${book.isbn}
                                                <a href="InventoryServlet?action=add&isbn=${book.isbn}">Add cart</a>
                                            </div>
                                        </div>
                                    </div>
                                            <div class="row">
                                                <form> </form>
                                    </div>
                                </div>
                                            
                                            
                            </div>
                        </c:forEach> 
                    </table>
                </div>
                </div>
            </div>
        <%@include file="footer.jsp"%>
</body>
</html>

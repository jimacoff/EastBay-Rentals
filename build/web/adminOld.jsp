<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="include/style/bootstrap.css">
        <link rel="stylesheet" href="include/style/bootstrap-theme.css">
        <link rel="stylesheet" href="include/style/style.css">

        <script src="include/js/jquery-2.1.4.js"></script>
        <script src="include/js/bootstrap.js"></script>
    </head>
    <body>
        <div style="container">
            <div class="row">
                <div class="col-md-10">
            
        <p> User List </p>
         <table class="table">
            <tr>
                <th>Username </th>
                <th>Password</th>
                <th>Email</th>
                <th>Actions</th>
            </tr>
        <c:forEach var="user" items="${requestScope.users}">
            
            <tr>
                <td>
                    ${user.username}
                </td>
                   <td>
                    ${user.password}
                </td>
                   <td>
                    ${user.email}
                </td>
                <td>
                    <a class="btn btn-xs btn-danger" href="AdminServlet?action=delete&email=${user.email}">Delete</a>
                </td>
                <td>
                    <a class="btn btn-xs" href="AdminServlet?action=update&OldEmail=${user.email}">Update</a>
                </td>
            </tr>
       
        </c:forEach>
        </table>
             </div>
        </div>
            <div class="row">
                <div class="col-md-3"></div>
                <div class="col-md-6">
        <form role="form" action="AdminServlet?action=insert" method="post">
            <div class="form-group">
            <label>Username</label>
            <input class="form-control" type="text" name="username">
            </div>
            <div class="form-group">
            <label>Password</label>
            <input class="form-control" type="password" name="password">
            </div>
            <div class="form-group">
            <label>Email</label>
            <input class="form-control" type="email" name="email">
            </div>
            <input class="btn btn-primary" type="submit" value="Create a new user">
        </form>
                </div>
                <div class="col-md-3"></div>
                </div>
        </div>
           
    </body>
</html>

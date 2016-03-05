<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Rentals</title>
        <link rel="stylesheet" href="include/style/bootstrap.css">
        <link rel="stylesheet" href="include/style/bootstrap-theme.css">
        <link rel="stylesheet" href="include/style/style.css">

        <script src="include/js/jquery-2.1.4.js"></script>
        <script src="include/js/bootstrap.js"></script>

    </head>
    <body>
        <%@include file="header.jsp"%>
        <div class="container-fluid">
            <div class="col-lg-12">
            <div class="row"  >
                
                    <h1>Rentals</h1>

            </div>
                <%--    ${name} --%>
            
            <div class="row">

                    <table class="table"> 
                        <tr>
                            <th>isCar</th> 
                            <th>username</th>
                            <th>begin</th>
                            <th>end</th>
                            <th>total</th>
                        </tr>
                        


                        <c:forEach var="rental" items="${requestScope.rentals}" varStatus="status">
                            <tr >
                                <td>${rental.idCar}</td>
                                <td>${rental.username}</td>
                                <td>${rental.begin}</td>
                                <td>${rental.end}</td>
                                <td>${rental.total}</td>
                            </tr>
                            <div class="panel panel-default">
                            <form method="post" action="adm">
                                <input name="acao" type="hidden" value="delete">
                                <input type="hidden" name="username" value="${rental.username}"/>
                                <input type="hidden" name="total" value="${rental.total}"/>
                                ${rental.username} | 
                                <button class="btn btn-xs btn-danger">Delete</button>
                            </form>
                                <div class="panel-heading">
                                    
                                </div>
                                
                                <div class="panel-body">
                                    <div class="row">
                                        <div class="col-md-4">
                                            <div class="form-group">
                                                <strong>Car ID:</strong> ${rental.idCar}
                                            </div>
                                        </div>
                                    </div>
                                            <div class="row">
                                                <form> </form>
                                    </div>
                                </div>
                                <div class="panel-body">
                                    <div class="row">
                                        <div class="col-md-4">
                                            <div class="form-group">
                                                <strong>From:</strong> ${rental.begin}
                                            </div>
                                        </div>
                                    </div>
                                            <div class="row">
                                                <form> </form>
                                    </div>
                                </div>
                                <div class="panel-body">
                                    <div class="row">
                                        <div class="col-md-4">
                                            <div class="form-group">
                                                <strong>To:</strong> ${rental.end}
                                            </div>
                                        </div>
                                    </div>
                                            <div class="row">
                                                <form> </form>
                                    </div>
                                </div>
                                            <div class="panel-body">
                                    <div class="row">
                                        <div class="col-md-4">
                                            <div class="form-group">
                                                <strong>Total</strong> $${rental.total}0
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

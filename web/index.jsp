
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EastBay Rentals</title>
        <link rel="stylesheet" href="include/style/bootstrap.css">
        <link rel="stylesheet" href="include/style/bootstrap-theme.css">
         <link rel="stylesheet" href="include/style/style.css">
        
        <script src="include/js/jquery-2.1.4.js"></script>
        <script src="include/js/bootstrap.js"></script>
        
    </head>
    <body>
        <%@include file="header.jsp"%>
      


      
    
    

    <!-- Main jumbotron for a primary marketing message or call to action -->
    
    <div class="jumbotron">
      <div class="container">
        <h2>We are with you everywhere!</h2>
        <p>Hundreds of stores to provide you the best car rental service in the United States. Already a costumer? Log in above or</p>
        <p><a class="btn btn-success btn-lg" href="joinus.jsp" role="button">Join us!</a></p>
      </div>
    </div>

    <c:if test="${sessionScope.user.getUsername()=='root'}">
        <a href="admin.jsp">Admin</a>
    </c:if>

    <div class="container">
      <!-- Example row of columns -->
      <div class="row">
        <div class="col-md-4">
          <img src="include/img/camaro.jpg" class="col-md-12 img-responsive center-block">
          <h2>Sport Cars</h2>
          <p>If you like to speed and feel the adrenaline of the sport cars, we have the best ones around for you! </p>
          <p><a class="btn btn-default" href="sport.jsp" role="button">Check it out &raquo;</a></p>
        </div>
        <div class="col-md-4">
         <img src="include/img/sorento.jpg" class="col-md-12 img-responsive center-block">
          <h2>SUV</h2>
          <p>So you like the SUVs and the power of driving higher? Check out those brand new SUVs!</p>
          <p><a class="btn btn-default" href="suv.jsp" role="button">Check it out &raquo;</a></p>
       </div>
        <div class="col-md-4">
         <img src="include/img/caravan.jpg"  class="col-md-12 img-responsive center-block">
          <h2>Minivan</h2>
          <p>You need more seats to hang out with all your friends and family? We got your back!</p>
          <p><a class="btn btn-default" href="minivan.jsp" role="button">Check it out &raquo;</a></p>
        </div>
      </div>
      

       </div> <!-- /container -->
        
        <%@include file="footer.jsp"%>
        
        
    </body>
</html>


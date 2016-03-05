
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BayR Car Rental</title>
        <link rel="stylesheet" href="include/style/bootstrap.css">
        <link rel="stylesheet" href="include/style/bootstrap-theme.css">
         <link rel="stylesheet" href="include/style/style.css">
        
        <script src="include/js/jquery-2.1.4.js"></script>
        <script src="include/js/bootstrap.js"></script>
        
    </head>
    <body>
       
    

    <div class="container">

      <form class="form-signin" method="post" action="newclient">
        <h2 class="form-signin-heading">Fill in and join us today:</h2>
        <input type="text" name="fname" id="inputName" class="form-control" placeholder="First name" required autofocus>
        <input type="text" name="lname" id="inputLast" class="form-control" placeholder="Last name" required>
        <input type="email" name="email" id="inputEmail" class="form-control" placeholder="Email address" required >
        <input type="text" name="uname" id="inputUname" class="form-control" placeholder="Username" required >
        <input type="password" name="pswd" id="inputPassword" class="form-control" placeholder="Password" required>

       
        <button class="btn btn-lg btn-success btn-block" type="submit">Sign up</button>
      </form>

    </div> <!-- /container -->


    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
        
     <%@include file="footer.jsp"%>
        
        
    </body>
</html>


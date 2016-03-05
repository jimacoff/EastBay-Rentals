

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
  <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Please log in</title>
        <link rel="stylesheet" href="include/style/bootstrap.css">
        <link rel="stylesheet" href="include/style/bootstrap-theme.css">
         <link rel="stylesheet" href="include/style/style.css">
        
        <script src="include/js/jquery-2.1.4.js"></script>
        <script src="include/js/bootstrap.js"></script>
        
    </head>

  <body>

    <div class="container">

      <c:if test="${requestScope.login_error != null}">
          <div class="alert alert-danger"
             <span>${requestScope.login_error}</span>
          </div>
      </c:if>

      <form class="form-signin" method="post" action="login">
        <h2 class="form-signin-heading">Please sign in to continue...</h2>
        
        <input type="text" id="inputEmail" name="username" class="form-control" placeholder="Username" required autofocus>
        
        <input type="password" id="inputPassword" name="password" class="form-control" placeholder="Password" required>
        <div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me"> Remember me
          </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
      </form>

    </div> <!-- /container -->


    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>

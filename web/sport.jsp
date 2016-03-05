
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Rent a Minivan</title>
        <link rel="stylesheet" href="include/style/bootstrap.css">
        <link rel="stylesheet" href="include/style/bootstrap-theme.css">
        <link rel="stylesheet" href="include/style/style.css">
        <link rel="stylesheet" href="include/style/caroussel.css"> 

        <script src="include/js/jquery-2.1.4.js"></script>
        <script src="include/js/bootstrap.js"></script>

    </head>
    <body>
        <%@include file="header.jsp"%>
         <div class="navbar-wrapper">
      <div class="container">

        

      </div>
    </div>


    <!-- Marketing messaging and featurettes
    ================================================== -->
    <!-- Wrap the rest of the page in another container to center all the content. -->

    <div class="container marketing">

      <!-- Three columns of text below the carousel -->
      <div class="row">
       
      </div><!-- /.row -->


      <!-- START THE FEATURETTES -->

  

      <div class="row featurette">
        <div class="col-md-7">
          <h2 class="featurette-heading">Chevrolet <span class="text-muted">Camaro</span></h2>
          <p class="lead">The Camaro coupe and convertible follow the typical muscle-car recipe. With a 335-hp 3.6-liter V-6 it is beautiful and furious.</p>
            <form method="post" action="getready">
                <input type="hidden" name="id" value="8"/>
                <button class="btn btn-danger" href="getready" role="button">Book now!</button>
            </form>
        </div>
        <div class="col-md-5">
          <img class="featurette-image img-responsive center-block" src="include/img/camaro2.jpg" alt="Generic placeholder image"\>
        </div>
      </div>

      <hr class="featurette-divider">

      <div class="row featurette">
        <div class="col-md-7 col-md-push-5">
          <h2 class="featurette-heading">Ford <span class="text-muted">Mustang</span></h2>
          <p class="lead">The iconic Mustang preserves a legacy that defines American motoring. 300-hp 3.7-liter V-6 and  15/25 mpg</p>
             <form method="post" action="getready">
                <input type="hidden" name="id" value="7"/>
                <button class="btn btn-danger" href="getready" role="button">Book now!</button>
            </form>
        </div>
        <div class="col-md-5 col-md-pull-7">
          <img class="featurette-image img-responsive center-block" src="include/img/mustang.jpg" alt="Generic placeholder image">
        </div>

        
        
      </div>

      <hr class="featurette-divider">

      <div class="row featurette">

        <div class="col-md-7">
          <h2 class="featurette-heading">Chevrolet <span class="text-muted">Corvette</span></h2>
          <p class="lead">The mighty Corvette truly competes with the world’s greatest sports cars, no excuses required. With a 6.2-liter V-8 making 455 hp and 460 lb-ft of torque, it is a perfomance bargain that you must drive to believe. </p>
          <p>
            <form method="post" action="getready">
                <input type="hidden" name="id" value="9"/>
                <button class="btn btn-danger" href="getready" role="button">Book now!</button>
            </form>
           </p>
        </div>
        <div class="col-md-5">
          <img class="featurette-image img-responsive center-block" src="include/img/corvette.jpg" alt="Generic placeholder image">
        </div>
      </div>


      <!-- /END THE FEATURETTES -->


      
    </div><!-- /.container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
    <script src="../../dist/js/bootstrap.min.js"></script>
    <!-- Just to make our placeholder images work. Don't actually copy the next line! -->
    <script src="../../assets/js/vendor/holder.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>

        <%@include file="footer.jsp"%>
    </body>
</html>    

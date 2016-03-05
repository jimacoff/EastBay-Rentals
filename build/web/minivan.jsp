
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
          <h2 class="featurette-heading">Honda <span class="text-muted">Odyssey</span></h2>
          <p class="lead">The Odyssey has room for up to eight passengers to sit comfortably, and is also fuel-efficient. 248-hp 3.5-liter V-6 19/28 mpg </p>
             <form method="post" action="getready">
                <input type="hidden" name="id" value="1"/>
                <button class="btn btn-danger" href="getready" role="button">Book now!</button>
            </form>
        </div>
        <div class="col-md-5">
          <img class="featurette-image img-responsive center-block" src="include/img/odyssey.jpg" alt="Generic placeholder image"\>
        </div>
      </div>

      <hr class="featurette-divider">

      <div class="row featurette">
        <div class="col-md-7 col-md-push-5">
          <h2 class="featurette-heading">Kia <span class="text-muted">Sedona</span></h2>
          <p class="lead">With room for eight and a long list of safety features, the Sedona is powered by a 276-hp, 3.3-liter V-6 17/22 mpg</p>
             <form method="post" action="getready">
                <input type="hidden" name="id" value="2"/>
                <button class="btn btn-danger" href="getready" role="button">Book now!</button>
            </form>
        </div>
        <div class="col-md-5 col-md-pull-7">
          <img class="featurette-image img-responsive center-block" src="include/img/sedona.jpg" alt="Generic placeholder image">
        </div>

        
        
      </div>

      <hr class="featurette-divider">

      <div class="row featurette">

        <div class="col-md-7">
          <h2 class="featurette-heading">Dodge <span class="text-muted">Grand Caravan</span></h2>
          <p class="lead">The Grand Caravan gets credit for starting the whole minivan craze, the sole powertrain is a 283-hp 3.6-liter V-6 with front-wheel drive and a six-speed automatic. 17/25 mpg</p>
          <p>
            <form method="post" action="getready">
                <input type="hidden" name="id" value="3"/>
                <button class="btn btn-danger" href="getready" role="button">Book now!</button>
            </form>
           </p>
        </div>
        <div class="col-md-5">
          <img class="featurette-image img-responsive center-block" src="include/img/caravan.jpg" alt="Generic placeholder image">
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
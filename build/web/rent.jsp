<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Book now!</title>
        <link rel="stylesheet" href="include/style/bootstrap.css">
        <link rel="stylesheet" href="include/style/bootstrap-theme.css">
        <link rel="stylesheet" href="include/style/style.css">
        <link rel="stylesheet" href="include/style/caroussel.css"> 

        <script src="include/js/jquery-2.1.4.js"></script>
        <script src="include/js/bootstrap.js"></script>
        <script src="include/js/static.js"></script>
    </head>
    <body>
    <%@include file="header.jsp"%>
         
    <div class="container">
      
      
        <div class="row featurette">

            <div class="col-md-7">

                <h2 class="featurette-heading">You're almost set, ${sessionScope.user.getUsername()}!</h2>
                <p class="lead">
                <span class="text-muted">
                    ${requestScope.car.brand} 
                </span>${requestScope.car.name} 
                <strong>
                    $${requestScope.car.cost}0</strong>/day
                </p>

                <c:choose>
                <c:when test="${requestScope.valid == true}">                     
                    <p class="lead">Your rental is from: <strong>${requestScope.begin}</strong> to: <strong>${requestScope.end}</strong></p>
                    <h1>Total: $${requestScope.rental.total}0</h1>
                    
                    
                        
                          
                          
                          <br/>
                          <br/>
                          <br/>
                          <fieldset>
                    <form action="sucess.jsp" method="post">      
<label id="card">
      <h1 class="lead"><strong>Payment</strong></h1>
      <hr>
      <div class="form-group">
        <label class="col-sm-3 control-label" for="card-holder-name">Name on Card</label>
        <div class="col-sm-9">
          <input type="text" class="form-control" name="card-holder-name" id="card-holder-name" placeholder="Card Holder's Name" required="required">
        </div>
      </div>
      <div class="form-group">
        <label class="col-sm-3 control-label" for="card-number">Card Number</label>
        <div class="col-sm-9">
          <input type="text" class="form-control" name="card-number" id="card-number" placeholder="Debit/Credit Card Number" required="required">
        </div>
      </div>
      <div class="form-group">
        <label class="col-sm-3 control-label" for="expiry-month">Expiration Date</label>
        <div class="col-sm-9">
          <div class="row">
            <div class="col-xs-3">
              <select class="form-control col-sm-2" name="expiry-month" id="expiry-month" required="required">
                <option>Month</option>
                <option value="01">Jan (01)</option>
                <option value="02">Feb (02)</option>
                <option value="03">Mar (03)</option>
                <option value="04">Apr (04)</option>
                <option value="05">May (05)</option>
                <option value="06">June (06)</option>
                <option value="07">July (07)</option>
                <option value="08">Aug (08)</option>
                <option value="09">Sep (09)</option>
                <option value="10">Oct (10)</option>
                <option value="11">Nov (11)</option>
                <option value="12">Dec (12)</option>
              </select>
            </div>
            <div class="col-xs-3">
              <select class="form-control" name="expiry-year" required="required">
                <option value="13">2013</option>
                <option value="14">2014</option>
                <option value="15">2015</option>
                <option value="16">2016</option>
                <option value="17">2017</option>
                <option value="18">2018</option>
                <option value="19">2019</option>
                <option value="20">2020</option>
                <option value="21">2021</option>
                <option value="22">2022</option>
                <option value="23">2023</option>
              </select>
            </div>
          </div>
        </div>
      </div>
      <div class="form-group">
        <label class="col-sm-3 control-label" for="cvv">Card CVV</label>
        <div class="col-sm-3">
          <input type="text" class="form-control" name="cvv" id="cvv" placeholder="Security Code" required="required">
        </div>
      </div>
      <div class="form-group">
        <div class="col-sm-offset-3 col-sm-9">
          <button  type="submit" class="btn btn-success" type="submit">Pay Now</button>
          
        </div>
      </div>
               </label>
      </form>
    </fieldset>
               
                        
                            
                        
                        
                    
                </c:when>
                 <c:when test="${requestScope.valid == false}">                     
                    <p class="lead">${requestScope.inicio}</p>
                    <h1>This car is currently rented until: ${requestScope.end}</h1>
                </c:when>
                <c:otherwise>
                    
                    <form method="post" action="rental">
                        <label>
                          <input name="id" type="hidden" value="${requestScope.car.id}"/>  
                          From: <input id="from" class="lead" type="date" name="begin" required> To: <input id="to" class="lead" type="date" name="end" required> 
                        </label>
                        <p>
                            <button id="calculate" class="btn btn-success">Calculate</button>
                        </p>
                    </form>   
                    

                </c:otherwise>
            </c:choose>

            </div>

            <div class="col-md-5">
              <img class="featurette-image img-responsive center-block" src=${requestScope.car.pict} alt="Generic placeholder image">
            </div>
       
            <!--<a class="btn btn-danger" href="getready" role="button">Book now!</a>-->
           
        </div> 


    </div>
      
    </body>
</htlm>
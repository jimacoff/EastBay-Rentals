 <div class="container">
                <c:if test="${requestScope.login_error != null}">
                    <div class="alert alert-danger"
                         <span>${requestScope.login_error}</span>
                    </div>
                </c:if>
        </div>
        <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="index.jsp">EastBay Rentals</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          	<c:choose>
	            <c:when test="${sessionScope.user.getUsername() == null}">	                   
		            <form class="navbar-form navbar-right" action="login" method="post">
		              <div class="form-group">
		                <input type="text" placeholder="Username" class="form-control" name="username">
		              </div>
		              <div class="form-group">
		                <input name="password" type="password" placeholder="Password" class="form-control">
		              </div>
		              <button type="submit" class="btn btn-primary">Sign in</button>
		            </form>
	            </c:when>
	            <c:otherwise>
	                <span  class="navbar-right">
	                    <h5 style="color: grey">Welcome ${sessionScope.user.getUsername()}! &raquo;<a class="link" href="logout">log out</a></h5>
	                    
	                </span>
	            </c:otherwise>
          </c:choose>
            
        </div><!--/.navbar-collapse -->
      </div>
    </nav>
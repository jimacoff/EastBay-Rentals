<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin</title>
        <link rel="stylesheet" href="include/style/bootstrap.css">
        <link rel="stylesheet" href="include/style/bootstrap-theme.css">
        <link rel="stylesheet" href="include/style/style.css">
        <script src="include/js/jquery-2.1.4.js"></script>
        <script src="include/js/bootstrap.js"></script>
        
    </head>
    <body>
        <%@include file="header.jsp"%>
        <br/>
        <br/>
        <br/><br/>
        <br/>
        <br/>
        <div class="container">
        <form method="post" action="adm">
        	<input name="acao" type="hidden" value="rentals">
        	<button>Rentals</button>
        </form>
        </div>

	</body>	
</html>
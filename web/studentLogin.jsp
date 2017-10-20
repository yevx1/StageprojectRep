<%-- 
    Document   : studentLogin
    Created on : Oct 12, 2017, 12:31:21 PM
    Author     : yvex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
 <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Bootstrap 101 Template</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
    <body>
        
        <div class = "container">
	<div class="wrapper">
		<form action="<%=request.getContextPath()%>/StudentenLogin" method="post" name="Login_Form" class="form-signin">       
		    <h3 class="form-signin-heading">Welcome! Please Sign In</h3>
			  <hr class="colorgraph"><br>
			  
			  <input type="text" class="form-control" name="un" placeholder="Username" required="" autofocus="" />
			  <input type="password" class="form-control" name="pw" placeholder="Password" required=""/>     		  
			 
			  <button class="btn btn-lg btn-primary btn-block"  name="Submit" value="Login" type="Submit">Login</button>  			
		</form>			
	</div>
</div>
        
    </body>
</html>


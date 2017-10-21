<%-- 
    Document   : failure
    Created on : Oct 12, 2017, 12:35:03 PM
    Author     : yvex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <%
    String retry = request.getParameter("retry");
    %>
    <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Bootstrap 101 Template</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
    <body>
        <h1>Wrong Credentials</h1>
        <form name="HomePage" action="index.jsp" >
            <input class="btn btn-default" type="submit" value="Index" name="showListButton" />
        </form>
        
        <br><br><br>
        <%if (retry != null && retry.equals("student")){%>
        <a href="studentLogin.jsp">Try again</a>
        <%}
        else if(retry != null && retry.equals("company")){%>

        <a href="bedrijvenLogin.jsp" class="btn btn-default">Try again</a>

        <%} %>
       <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
    </body>
</html>

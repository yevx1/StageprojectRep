<%-- 
    Document   : bedrijven
    Created on : Sep 26, 2017, 3:00:00 PM
    Author     : yvex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% String userId=(String)request.getAttribute("userId");
String un=(String)request.getAttribute("uname");
String primID = (String)request.getAttribute("primID");
%>
<!DOCTYPE html>
<html lang="en">
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
    <center>
        <h1>Welcome <%=un%></h1>
        <h1>Your ID is <%=userId%></h1>
         </center>
         <center>
             <br><br><br>
        
         <a href="stageplaatsToevoegen.jsp?primID=<%= primID%>" class="btn btn-default">Stageplaats Toevoegen</a>  
        
        
        
             <a href="CompanyList?un=<%= un%> &userId=<%= userId%> &primID=<%= primID%>" class="btn btn-default">Stageplaatsen Bekijken</a>  
                                     
        </center>
       <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
        </body>
</html>

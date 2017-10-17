<%-- 
    Document   : bedrijven
    Created on : Sep 26, 2017, 3:00:00 PM
    Author     : yvex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% String userId=request.getParameter("userId");
String un=request.getParameter("uname");
String primID = request.getParameter("primID");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="stagebedrijven.css"/>
        <title>Bedrijven Page</title>
    </head>
    
    <body>
        <h1>Welcome <%=un%></h1>
        <h1>Your ID is <%=userId%></h1>
    <form name="Stageplaats Toevoegen" action="stageplaatsToevoegen.jsp?" >
         <li><a href="stageplaatsToevoegen.jsp?primID=<%= primID%>">Stageplaats Toevoegen</a></li>
         
        </form>
  <form name="HomePage" action="index.jsp" >
            <input class="btn" type="submit" value="Index" name="showListButton" />
        </form>
        
        <form name="Check List" action="list.jsp?" >
         <li><a href="list.jsp?primID=<%= primID%>">Lijst bekijken</a></li>
         
        </form>
        
        
        </body>
</html>

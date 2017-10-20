<%-- 
    Document   : failure
    Created on : Oct 12, 2017, 12:35:03 PM
    Author     : yvex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
    String retry = request.getParameter("retry");
    %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Failure Page</title>
        <link rel="stylesheet" href="stagebedrijven.css"/>
    </head>
    <body>
        <h1>Wrong Credentials</h1>
        <form name="HomePage" action="index.jsp" >
            <input class="btn" type="submit" value="Index" name="showListButton" />
        </form>
        
        <br><br><br>
        <%if (retry != null && retry.equals("student")){%>
        <a href="studentLogin.jsp">Try again</a>
        <%}
        else if(retry != null && retry.equals("company")){%>

            <a href="bedrijvenLogin.jsp">Try again</a>

        <%} %>
       
    </body>
</html>

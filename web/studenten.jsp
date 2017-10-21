<%-- 
    Document   : studenten
    Created on : Sep 26, 2017, 3:00:34 PM
    Author     : yvex
--%>

<%@page import="java.util.LinkedHashSet"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.HashSet"%>
<%@page import="DAO.DAOStageplaatsen"%>
<%@page import="java.util.ArrayList"%>
<%@page import="DAL.Stageplaatsen"%>

     

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="stagebedrijven.css"/>
        <title>Student Page</title>
    </head>
    <body>
        <% String userId=(String)request.getAttribute("userId");
String un=(String)request.getAttribute("uname");
Set<String>noDuplicates = (Set<String>)request.getAttribute("bedrijvenlist");
%>
        <h1>Welcome <%=un%></h1>
        <h1>Your ID is <%=userId%></h1>
        <h3>Lijst van mogelijke stageplaatsen</h3> <br><br><br>
        <%
             for (String elem : noDuplicates) { 
                
        %>
        
        
        <form name="studentenToDetailsForm" action="DetailsController">
        <ul>
            
            
             <li><a href="Details?naam=<%=elem%> &userId=<%=userId%>"><%=elem%></a></li>
            
        </ul>
        </form>

        
        

        <%}%>
        <br>
        <br>
        <form name="HomePage" action="index.jsp" >
            <input class="btn" type="submit" value="Index" name="showListButton" />
        </form>
    </body>
</html>
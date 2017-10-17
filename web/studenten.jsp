<%-- 
    Document   : studenten
    Created on : Sep 26, 2017, 3:00:34 PM
    Author     : yvex
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="DAL.Stageplaatsen"%>
<%@page import="DAL.DAOStageplaatsen"%>
     

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% String userId=request.getParameter("userId");
String un=request.getParameter("uname");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="stagebedrijven.css"/>
        <title>Student Page</title>
    </head>
    <body>
        <h1>Welcome <%=un%></h1>
        <h1>Your ID is <%=userId%></h1>
        <h3>Lijst van mogelijke stageplaatsen</h3> <br><br><br>
        <%
        
         ArrayList<Stageplaatsen> bedrijvenlist = new ArrayList<Stageplaatsen>();
             DAOStageplaatsen dao = new DAOStageplaatsen();
             bedrijvenlist = (ArrayList<Stageplaatsen>) dao.getAllUserss();
             for (Stageplaatsen object : bedrijvenlist) {
                    
                 
                    
        %>
        <form name="studentenToDetailsForm" action="DetailsController">
        <ul>
            
            
             <li><a href="DetailsController?naam=<%=object.getNaam() %>"><%=object.getNaam() %></a></li>
            
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
<%-- 
    Document   : details
    Created on : Sep 26, 2017, 3:00:10 PM
    Author     : yvex
--%>

<%@page import="DAO.DAOStageplaatsen"%>
<%@page import="DAL.Stageplaatsen"%>

<%@page import="java.util.ArrayList"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Details Page</title>
    </head>
    <body>
        
        
        <%
        
         ArrayList<Stageplaatsen> bedrijvenlist = new ArrayList<Stageplaatsen>();
             
             bedrijvenlist = (ArrayList<Stageplaatsen>)request.getAttribute("bedrijvenlist");
        String naam = (String)request.getAttribute("name");
        %>
             <h3> <%=naam%> </h3>
             
             
             <%
             for (Stageplaatsen stagebedrijven : bedrijvenlist) {
                 
                    String description = stagebedrijven.getBeschrijving(); %>
                    
                    <ul>
                        <li><%=description%> <br><%=stagebedrijven.getEmail() %> </li>
                        
                    </ul>
                    
                    
                    
            <% }  %>
       
                    
                 
                    
        
        
    </body>
</html>

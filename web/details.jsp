<%-- 
    Document   : details
    Created on : Sep 26, 2017, 3:00:10 PM
    Author     : yvex
--%>

<%@page import="DAL.DAOStageplaatsen"%>
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
             DAOStageplaatsen dao = new DAOStageplaatsen();
             bedrijvenlist = (ArrayList<Stageplaatsen>) dao.getAllUserss();
             String naam = (String)request.getAttribute("name"); %>
             <h3> <%=naam%> </h3>
             
             
             <%
             for (Stageplaatsen stagebedrijven : bedrijvenlist) {
                 if (stagebedrijven.getNaam() == null ? naam == null : stagebedrijven.getNaam().equals(naam)) {
                    String description = stagebedrijven.getBeschrijving(); %>
                    
                    <ul>
                        <li><%=description%> <br><%=stagebedrijven.getEmail() %> </li>
                        
                    </ul>
                    
                    
                    
            <% }  %>
            <% }  %>
                    
                 
                    
        
        
    </body>
</html>

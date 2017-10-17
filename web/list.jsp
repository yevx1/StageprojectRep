<%-- 
    Document   : list
    Created on : Sep 26, 2017, 3:00:20 PM
    Author     : yvex
--%>

<%@page import="DAO.DAOStageplaatsen"%>
<%@page import="DAL.Stageplaatsen"%>
<%@page import="org.apache.jasper.tagplugins.jstl.ForEach"%>

<%@page import="java.util.ArrayList"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="stagebedrijven.css"/>
        <title>List Page</title>
    </head>
  
    <body>
    
    <%
        String primID = (String)request.getAttribute("IDprim"); 
         ArrayList<Stageplaatsen> bedrijvenlist = new ArrayList<Stageplaatsen>();
             DAOStageplaatsen dao = new DAOStageplaatsen();
             bedrijvenlist = (ArrayList<Stageplaatsen>) dao.getAllUserss();
             
             Integer idPrim = Integer.parseInt(primID);
             for (Stageplaatsen elem : bedrijvenlist) {
                 String bedrijvenID = Integer.toString(elem.getBedrijvenId());
                 if (primID ==null? bedrijvenID==null:primID.equals(bedrijvenID)) {
                         String description = elem.getBeschrijving();
                         String email = elem.getEmail();
                         String naam = elem.getNaam();
                         %>
                           <ul>
                        <li><%=naam %> <%=description%> <%=email %> </li>                        
                    </ul> 
                     
                    
                        
     <%                    }
 
                 }
    %>
          
        <br>
        <br>
        <form name="HomePage" action="index.jsp" >
            <input class="btn" type="submit" value="Index" name="showListButton" />
        </form>
        
    </body>
</html>


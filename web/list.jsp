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
        String primID = "0" ;
        if (request.getAttribute("IDprim")!= null) {
                 primID = (String)request.getAttribute("IDprim");
            }
        else if (request.getParameter("IDprim")!= null) {
                 primID = request.getParameter("IDprim");
            }
        
         ArrayList<Stageplaatsen> bedrijvenlist = new ArrayList<Stageplaatsen>();
             DAOStageplaatsen dao = new DAOStageplaatsen();
             Integer idPrim = Integer.parseInt(primID);
             bedrijvenlist = (ArrayList<Stageplaatsen>) dao.getFKIDUserss(idPrim);
             
             
             
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
        <form name="HomePageBedrijven" action="bedrijven.jsp " >
            <ul>
            <li><a href="bedrijven.jsp?primID=<%= primID%> userId = <%%>">Home</a></li>
            </ul>
        </form>
        
    </body>
</html>


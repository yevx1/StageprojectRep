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
        
            
            <a href="bedrijven.jsp?primID=<%= primID%> userId = <%%>" class="btn btn-default">Home</a>
            
        
        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
    </body>
</html>


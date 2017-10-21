<%-- 
    Document   : stageplaatsToevoegen
    Created on : Oct 16, 2017, 2:16:42 PM
    Author     : yvex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%String primID = request.getParameter("primID");
String userId = request.getParameter("userId");
String un = request.getParameter("un");
%>
<!DOCTYPE html>
<html>
     <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Stageplaats Toevoegen</title>
        <link rel="stylesheet" href="stagebedrijven.css"/>
    </head>


    <body>
        
        <h1>Stageplaats toevoegen</h1>
        
        <form name="stageplaatsenAddForm" action="Stageplaats">
            Naam:<br> <input type="text" name="naam" value="" > <br>
             Adres:<br> <input type="text" name="adres" value="" ><br>
             Postcode:<br> <input type="text" name="postcode" value="" ><br>
             Email:<br> <input type="text" name="email" value="" ><br>
             <br> <input type="hidden" name="primID" value="<%= primID%>" ><br>
             <input type="hidden" name="userId" value="<%= userId%>" >
            
             
             Beschrijving:<br><textarea class="descri" name="beschrijving"></textarea><br>
             <input class="btn" type="submit" value="addUser" name="addButton" /><br>
        </form>
         <a href="CompanyList?un=<%= un%>&userId=<%= userId%>&primID=<%= primID%>" class="btn btn-default">Stageplaatsen Bekijken</a>
    </body>
</html>

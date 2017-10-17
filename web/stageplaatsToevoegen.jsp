<%-- 
    Document   : stageplaatsToevoegen
    Created on : Oct 16, 2017, 2:16:42 PM
    Author     : yvex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%String primID = request.getParameter("primID");%>
<!DOCTYPE html>
<html>
     <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Stageplaats Toevoegen</title>
        <link rel="stylesheet" href="stagebedrijven.css"/>
    </head>

</div>
    <body>
        
        <h1>Stageplaats toevoegen</h1>
        
        <form name="stageplaatsenAddForm" action="StagePlaatsenController">
            Naam:<br> <input type="text" name="naam" value="" > <br>
             Adres:<br> <input type="text" name="adres" value="" ><br>
             Postcode:<br> <input type="text" name="postcode" value="" ><br>
             Email:<br> <input type="text" name="email" value="" ><br>
             ControleNummer:<br> <input type="text" name="primID" value="<%= primID%>" ><br>
            
             
             Beschrijving:<br><textarea class="descri" type ="text" name="beschrijving"></textarea><br>
             <input class="btn" type="submit" value="addUser" name="addButton" /><br>
        </form>
        <form name="stagebedrijvenShowListForm" action="list.jsp" >
            <input class="btn" type="submit" value="showList" name="showListButton" />
        </form>
    </body>
</html>

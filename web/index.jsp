<%-- 
    Document   : index
    Created on : Oct 14, 2017, 12:26:33 PM
    Author     : yvex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <title>Index Page</title>
        <link rel="stylesheet" href="stagebedrijven.css"/>
    </head>
    <body>
        <br><br><br>
        <h1>Welkom</h1>
        <br><br><br>
        <center>
         <form name="studentForm" action="studentLogin.jsp" >
            <input class="btn" type="submit" value="Student" name="showStudentLoginPage" />
        </form>
        <form name="bedrijvenForm" action="bedrijvenLogin.jsp" >
            <input class="btn" type="submit" value="Bedrijven" name="showBedrijvenLoginPage" />
        </form>
        </center>
    </body>
</html>

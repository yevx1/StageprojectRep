<%-- 
    Document   : studentLogin
    Created on : Oct 12, 2017, 12:31:21 PM
    Author     : yvex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <table>
            <tr>
                <td>Login</td>
                
            </tr>
            <tr>
                <td>
                    <table bgcolor="yellow">
                        <form method="post" action="<%=request.getContextPath()%>/StudentenLogin">
                           
                        <tr>
                            <td>User Name </td>
                            <td><input type="text" name="un"></td>
                        </tr>
                         <tr>
                            <td>Password </td>
                            <td><input type="password" name="pw"></td>
                        </tr>
                         <tr>
                            <td></td>
                            <td><input type="submit" value="login"></td>
                        </tr>
                         </form>
                    </table>
                </td>
               
            </tr>
        </table>
    </center>       
    </body>
</html>

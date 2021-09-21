<%-- 
    Document   : index
    Created on : 18/09/2021, 03:02:07 AM
    Author     : cristian-patino
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h1>Solo se acepta la operacion de dos numeros</h1>
        <form action="./CalcServlet" method="POST">
            <input type="text" name="yearLevel" value="${label}" size="70"/>
            <br> </br>  
        
        <table border="1" width="10" cellspacing="10" cellpadding="40">
            <thead>
                <tr>
                    <th></th>
                    <th><input type="submit" name="valor" value="C" /></th>
                    <th><input type="submit" name="valor" value="%" /></th>
                    <th><input type="submit" name="valor" value="^2" /></th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <th><input type="submit" name="valor" value="7" /></th>
                    <th><input type="submit" name="valor" value="8" /></th>
                    <th><input type="submit" name="valor" value="9" /></th>
                    <th><input type="submit" name="valor" value="/" /></th>
                </tr>
                <tr>
                    <th><input type="submit" name="valor" value="4" /></th>
                    <th><input type="submit" name="valor" value="5" /></th>
                    <th><input type="submit" name="valor" value="6" /></th>
                    <th><input type="submit" name="valor" value="*" /></th>
                </tr>
                <tr>
                    <th><input type="submit" name="valor" value="1" /></th>
                    <th><input type="submit" name="valor" value="2" /></th>
                    <th><input type="submit" name="valor" value="3" /></th>
                    <th><input type="submit" name="valor" value="-" /></th>
                </tr>
                <tr>
                    <th></th>
                    <th><input type="submit" name="valor" value="0" /></th>
                    <th><input type="submit" name="valor" value="=" /></th>
                    <th><input type="submit" name="valor" value="+" /></th>
                
            </tbody>
        </table>
        </form>
        
    </body>
</html>


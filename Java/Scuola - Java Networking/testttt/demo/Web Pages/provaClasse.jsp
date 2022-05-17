<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ page import="com.appdemo.jsp.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Utilizzare le classi con JSP</h1>
        <h3>Uso della classe:</h3>
        <h2 style="color: #f00;"><%= TestJsp.minuscolo("JAVA IS GREAT")%></h2>
    </body>
</html>

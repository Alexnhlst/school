<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ page import="com.appdemo.TestJsp.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home page</title>
    </head>
    <body>
        <jsp:include page="header.html"/>
        <h1>Hello world!</h1>
        <jsp:include page="footer.jps"/>
    </body>
</html>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Utilizzo delle espressioni con JSP</h1>
        <h2>La data del server: <%= new java.util.Date() %></h2>
        <p>Converti la stringa in maiuscolo: <%= new String("JSP sono molto efficienti").toUpperCase() %></p>
        <hr/>
        <p>25 moltiplicato per 4: <%= 25 * 4 %> </p>
        <hr/>
        <h1>Utilizzo delle scriplet con JSP</h1>
        <%
            for(int i = 1; i <= 5; i++) {
                out.println("Java è bello " + i +"<br>");
            }
        %>
        <hr/>
        <h1>Utilizzo delle dichiarazioni in JSP</h1>
        <%!
            String minuscolo(String data) {
                return data.toLowerCase();
        }
        %>
        <h3>rendi minuscolo la scritta: <%= minuscolo("CIAO MONDO")%></h3>
    </body>
</html>

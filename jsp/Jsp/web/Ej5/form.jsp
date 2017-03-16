<%-- 
    Document   : form
    Created on : 23-feb-2017, 12:49:12
    Author     : isime
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        La cantidad de pesetas es:
        <%
            double euros = Double.parseDouble(request.getParameter("euros"));
            double resultado = euros * 166.386;
            DecimalFormat formato = new DecimalFormat("0.00");
            out.print(formato.format(resultado)); 
        %>
    </body>
</html>

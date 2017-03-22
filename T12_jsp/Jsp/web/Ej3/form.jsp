<%-- 
    Document   : form
    Created on : 23-feb-2017, 12:44:05
    Author     : isime
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <body>
        <% request.setCharacterEncoding("UTF-8"); %>
        Hola
        <% out.print(request.getParameter("nombre")); %>
        , mucho gusto!
    </body>
    </body>
</html>

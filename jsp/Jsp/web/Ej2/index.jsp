<%-- 
    Mejora el programa anterior de tal forma que la apariencia de la página
web que muestra el navegador luzca más bonita mediante la utilización de
CSS (utiliza siempre ficheros independientes para CSS para no mezclarlo con
HTML).
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="estilos.css"/>
    </head>
    <body>
         <div id="text">
            <% 
               out.println("<h1>Isaias Montiel Bravo</h1>");
               out.println("<h3>Calle Enenas nº20</h3>");
               out.println("<h3>656337783</h3>");
            %>
        </div>
    </body>
</html>

<%-- 
    Realiza una aplicación que pinte una pirámide. La altura se pedirá en un
formulario. La pirámide estará hecha de bolitas, ladrillos o cualquier otra
imagen.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div id="index">
            Por favor, introduce la altura de la pirámide 
            <form action="form.jsp" method="post">
                <input type="number" name="num" autocomplete="off" min="0" required>
                <input type="submit" name="ok" value="OK">
            </form>
        </div>
    </body>
</html>

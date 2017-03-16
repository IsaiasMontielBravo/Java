<%-- 
    Realiza un conversor de pesetas a euros.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <form action="form.jsp" method="post" >
            <table>
                <tr>
                    <td>Introduzca la cantidad de pesetas:</td>
                    <td><input type="number" name="pesetas" autocomplete="off" required></td>
                </tr>
            </table>
         </form>
    </body>
</html>

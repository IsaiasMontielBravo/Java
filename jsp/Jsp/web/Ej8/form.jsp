<%-- 
    Document   : form
    Created on : 23-feb-2017, 13:11:09
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
       <div id="form">
            <%
                int num = Integer.parseInt(request.getParameter("num"));
                out.print("<table>");
                for(int x = 0; x <= 10; x++) {
                    out.print("<tr>");
                    out.print("<td>" + num + "</td><td>x</td><td>" + x + "</td><td>=</td><td>" + x * num + "</td>");
                    out.print("</tr>");
                }
                out.print("</table>");
            %>
        </div>
    </body>
</html>

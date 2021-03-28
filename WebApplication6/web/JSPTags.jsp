<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>10 Numbers</title>
    </head>
    
    <body>
        <form method="Post" action="print.jsp">
            <% for(int i = 1; i <= 10; i++){%>
            <p>Number = <%=i%></p>
            <%}%>
    
            <input type="submit" value ="Submit"/>
        </form>
    </body>
</html>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>include</title>
    </head>
    <body style = "font-family:verdana; font-size: 10pt;">
        <%@include file = "header.jsp" %>
        <form action = "controller.jsp">
        <table border = "0" style = "font-family:verdana; font-size: 10pt;">
            <tr>
                <td>Amount:</td>
                <td><input type = "text" name = "amount"/></td>
            </tr>
            <tr>
                <td>Interest in %:</td>
                <td><input type = "text" name = "interest"/></td>
            </tr>
            <tr>
                <td>Compound:</td>
                <td><input type = "radio" name = "type" value="C" checked/></td>
            </tr>
            <tr>
                <td>Simple:</td>
                <td><input type ="radio" name = "type" value ="S"/></td>
            </tr>
            <tr>
                <td>Period:</td>
                <td><input type="text" name ="period"/></td>
            </tr>
        </table>
            <input type="submit" value ="Calculate"/>
        </form>
        <jsp:include page="footer.jsp"/>
    </body>
</html>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Enter values</title>
    </head>
    <body style = "font-family:verdana; font-size: 10pt;">
        <form method = "post" action ="Calculate.jsp">
        <table border = "1" style = "font-family:verdana; font-size: 10pt; border-collapse: collapse; padding: 15px;">
            
            <tr>
                <th>Name:</th>
                <td><input type = "text" name = "name"/></td>
            </tr>
            <tr>
                <th>Basic Salary:</th>
                <td><input type = "text" name = "basic"/></td>
            </tr>
            <tr>
                <th>HR Allowance:</th>
                <td><input type = "text" name = "hr"/></td>
            </tr>
            <tr>
                <th>Travel Allowance:</th>
                <td><input type = "text" name = "ta"/></td>
            </tr>
            <tr>
                <th>Provident Fund(in %):</th>
                <td><input type ="text" name="pf"/></td>
            </tr>
            
        </table>
            <input type="submit" value ="Submit"/>
            </form>
    </body>
</html>

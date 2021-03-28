<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login Form</h1>
        <form action="loginform.do" method="post">
            Username <input type="text" name="uname"/><br/>
            Password <input type="text" name="upass"/><br/>
            <input type="submit" value="Submit"/>
        </form>
    </body>
</html>

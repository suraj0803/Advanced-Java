<%@page isErrorPage = "true"%>
<html>
    <head>
        <title>Error Page</title>
    </head>
    <body style ="font-family: verdana;font-size:10pt;">
        <p><b><%= exception.getMessage()%></b></p>
                
    </body>
</html>
